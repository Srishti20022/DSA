package Array;

import java.util.Scanner;

//Upper Bound stands for the index of last occurence of element 
public class UpperBound {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Write the size of array : ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Write the elments of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Write the element whose Upper bound is required : ");
		int ele = scn.nextInt();
		int f = 0, l = n - 1, mid;
		int i = -1;

		// Binary search loop to find Upper bind of element
		while (l >= f) {
			mid = (l + f) / 2;
			if (arr[mid] > ele) {
				l = mid - 1;
			} else if (arr[mid] < ele) {
				f = mid + 1;
			} else {
				i = mid;
				f = mid + 1;
			}
		}
		if (i != -1)
			System.out.println("Upper bound of element " + ele + " is : " + i);
		else {
			System.out.println("Given element not found !!!");
		}
	}

}
