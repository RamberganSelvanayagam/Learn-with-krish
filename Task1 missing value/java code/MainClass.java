public class MainClass{
	 public static void main (String args[])
{
	MissingNumber mn=new MissingNumber();
	int a []={21,25,29,28,22,24,27,26,23};
	int length=a.length;
	mn.getNumber(a,length);
	mn.getMissedNumber(a);
}
}