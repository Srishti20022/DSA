package Challenge2;
// Challenge 2 is to store integer value in a linked list such that the integer stored would be in 
//increasing order when viewed from the head of the list

public class Main {

	public static void main(String[] args) {
		
		Integer five = new Integer(5);
		Integer nine = new Integer(9);
		Integer four = new Integer(4);
		Integer zero = new Integer(0);
		Integer negativeOne = new Integer(-1);
		
		IntegerLinkedList list = new IntegerLinkedList();
		list.add(five);
		list.printList();
		list.add(nine);
		list.printList();
		list.add(four);
		list.printList();
		list.add(zero);
		list.printList();
		list.add(negativeOne);
		list.printList();
//		list.add(five);
//		list.printList();
		
	}
	
}
