package linkedList;

public class EmployeeDoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void addToFront(Employee employee) {
		size++;
		EmployeeNode node = new EmployeeNode(employee);
		if(head == null) {
			tail = node;
		} else {
			node.setNext(head);
			head.setPrevious(node);
		}
		head = node;
	}
	
	public void addToLast(Employee employee) {
		size++;
		EmployeeNode node = new EmployeeNode(employee);
		if(tail==null) {
			head = node;
		} else {
			node.setPrevious(tail);
			tail.setNext(node);
		}
		tail = node;
	}
	public EmployeeNode removeFromLast() {
		size--;
		if(head == null)
			return null;
		if(tail.getPrevious()==null) {
			head = null;
		}else {
			tail.getPrevious().setNext(null);
		}
		EmployeeNode node = tail;
		tail = tail.getPrevious();
		node.setPrevious(null);
		return node;
		
	}
	public EmployeeNode removeFromFront() {
		size--;
		if(head==null)
			return null;
		EmployeeNode node = head;
		if(head.getNext()==null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		node.setNext(null);
		return node;
		
	}
	public boolean addBefore (Employee toAdd, Employee existing) {
		
		int flag = 0;
		EmployeeNode current = head;
		EmployeeNode newNode = new EmployeeNode(toAdd);
		while(current!=null) {
			if(current.getEmployee().equals(existing)) {
				flag = 1;
				break;
			}
			current = current.getNext();
		}
		if(flag != 1) {
			return false;
		}
		if(current.getPrevious()==null) {
			head = newNode;
		}else {
			newNode.setPrevious(current.getPrevious());
			newNode.getPrevious().setNext(newNode);
		}
		newNode.setNext(current);
		current.setPrevious(newNode);
		return true;
		
	}
	
	public void printList() {
		System.out.print("Head --> ");
		EmployeeNode current = head;
		while(current!=null) {
			System.out.print(current + " <--> ");
			current = current.getNext();
		}
		System.out.print("null");
		System.out.println();
	}

}
