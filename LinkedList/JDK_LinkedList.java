package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class JDK_LinkedList {

	public static void main(String[] args) {

		Employee srishtiGupta = new Employee("Srishti", "Gupta", 2002);
		Employee tanikshGupta = new Employee("Taniksh", "Gupta", 1999);
		Employee kanchaDevi = new Employee("Kancha", "Devi", 1973);
		Employee hariLal = new Employee("Hari", "Lal", 1973);
		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(srishtiGupta);
		
		Iterator iterator = list.iterator();
		System.out.print("head -->");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"<-->");
		}
		System.out.print("null");
		System.out.println();
		
		list.add(tanikshGupta);
		for(Employee employee : list) {
			System.out.print(employee);
		}
		System.out.println();
		list.removeLast();
		iterator = list.iterator();
		System.out.print("head -->");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"<-->");
		}
		System.out.print("null");
		System.out.println();
		list.removeFirst();
		iterator = list.iterator();
		System.out.print("head -->");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"<-->");
		}
		System.out.print("null");
		System.out.println();
		
	}

}
