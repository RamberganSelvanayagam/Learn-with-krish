public class ReverseLinkedList {
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



    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ReverseLinkedList sList = new ReverseLinkedList();

        //Add nodes to the list
        sList.addNode("R");
        sList.addNode("A");
        sList.addNode("M");
        sList.addNode("B");
        sList.addNode("E");
        sList.addNode("R");
        sList.addNode("G");
        sList.addNode("A");
        sList.addNode("N");


        sList.display();


    }
}
