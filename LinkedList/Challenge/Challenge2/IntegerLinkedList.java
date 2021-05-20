package Challenge2;

public class IntegerLinkedList {

	IntegerNode head;
	int size;

	public void add(Integer integer) {

		IntegerNode current = head;
		IntegerNode newNode = new IntegerNode(integer);
		if (head == null) {
			head = newNode;
			return;
		}
		if(current.getInt()>integer.getInteger()) {
			newNode.setNext(head);
			head = newNode;
			return;
		}
	
		while (current.getNext() != null) {
			if((current.getInt())<integer.getInteger() && (current.getNext().getInt())>integer.getInteger()) {
				newNode.setNext(current.getNext());
				break;
			}
			current = current.getNext();
		}
		current.setNext(newNode);
	}
	
	public void printList() {
		
		System.out.println();
		IntegerNode current = head;
		System.out.print("Head -->");
		while(current!=null) {
			System.out.print(current + "-->");
			current = current.getNext();
		}
		System.out.print("null");
		
	}

}
