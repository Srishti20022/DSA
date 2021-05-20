package linkedList;

public class Main {

	public static void main(String[] args) {
		
		Employee srishtiGupta = new Employee("Srishti", "Gupta", 2002);
		Employee tanikshGupta = new Employee("Taniksh", "Gupta", 1999);
		Employee kanchaDevi = new Employee("Kancha", "Devi", 1973);
		Employee hariLal = new Employee("Hari", "Lal", 1973);
		Employee kanchaniyagupta = new Employee("Kanchaniya", "Gupta", 1973);
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		
		list.addToFront(srishtiGupta);
		list.addToFront(tanikshGupta);
		list.addToFront(kanchaDevi);
		list.addToFront(hariLal);
//		list.printList();
//		list.removeFromLast();
//		list.printList();
//		list.removeFromFront();
//		list.printList();
		System.out.println(list.addBefore(kanchaniyagupta,kanchaDevi ));
		list.printList();

	}

}
