package bucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class main {

	public static void main(String[] args) {

		// Scanner scn = new Scanner(System.in);
		int[] arr = { 54, 46, 3, 66, 95, 92, 3 };
		bucketSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void bucketSort(int[] arr) {
		List<Integer>[] Hashtable;
		Hashtable = new List[10];
		for (int i = 0; i < 10; i++) {
			Hashtable[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < arr.length; i++) {
			int hashedKey = hashKey(arr[i]);
			Hashtable[hashedKey].add(arr[i]);
		}
		for (int i = 0; i < Hashtable.length; i++) {
			if (!Hashtable[i].isEmpty()) {
				Collections.sort(Hashtable[i]);
			}
		}
		int j = 0;
		for (int i = 0; i < 10; i++) {
			if (!Hashtable[i].isEmpty()) {
				ListIterator<Integer> iterator = Hashtable[i].listIterator();
				while (iterator.hasNext()) {
					arr[j++] = iterator.next();
				}
			}
		}
	}

	private static int hashKey(int a) {
		return a / 10;
	}

}

//	public void printHashtable() {
//		for(int i = 0; i<10 ; i++) {
//			System.out.print("Position "+i+": ");
//			if(Hashtable[i].isEmpty()) {
//				System.out.print("Empty");
//			} else {
//				ListIterator<Integer> iterator = Hashtable[i].listIterator();
//				while(iterator.hasNext()) {
//					System.out.print(iterator.next()+"-->");
//				}
//				System.out.print("null");
//				
//			}System.out.println();
//		}
//	}
//	
