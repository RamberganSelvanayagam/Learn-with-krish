
public class PalindromeLinkList {
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;

    public void addNode(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node reverseList(Node temp){
        Node current = temp;
        Node prevNode = null, nextNode = null;

        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }
    public void isPalindrome(){
        PalindromeLinkList.Node current = head;
        boolean flag = true;

        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        for(int i=1; i<mid; i++){
            current = current.next;
        }

        PalindromeLinkList.Node revHead = reverseList(current.next);

        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }




        if(flag)
            System.out.println("palindrome");
        else
            System.out.println(" not a palindrome");
    }



    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("lisy is ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PalindromeLinkList sList = new PalindromeLinkList();

        //Add nodes to the list
        sList.addNode("R");
        sList.addNode("A");
        sList.addNode("C");
        sList.addNode("E");
        sList.addNode("C");
        sList.addNode("A");
        sList.addNode("R");

        sList.isPalindrome();


    }
}
