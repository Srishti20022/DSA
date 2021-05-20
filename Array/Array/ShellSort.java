package Array;

import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Write the size of Array : ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Write the numberrs of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		// SHELL Sort
		for (int gap = n / 2; gap > 0; gap = gap / 2) {
			// Insertion sort when gap is not one but variable gap
			for (int i = gap; i < n; i++) {// iteration stats from index gap to the end of array
				int value = arr[i];
				int j ;
				for ( j = i; j >= gap && arr[j - gap] > value; j = j - gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = value;
			}
		}
		System.out.println("Array elements after sorting(SHELL Sort) : ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}

}
