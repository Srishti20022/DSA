package Array;

import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Size of array : ");
		int n = scn.nextInt();
		System.out.println("Write the elements of the array :");
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		QuickSort(arr,0,n);
		for(int i = 0; i<n ; i++) {
			System.out.println(arr[i]);
		}
	
		scn.close();
	}
	
	public static void QuickSort(int[] array, int start, int end) {
		int j = end;
		int i = start;
		if(end-start < 2) {
			return;
		}
		int pivot = array[start];
		
		while(i<j) {
			while(i<j && pivot<=array[--j]);
			array[i] = array[j];
			
			while(i<j && pivot>=array[++i]);
			array[j] = array[i];
		}
		
		array[j] = pivot;
		int mid = j;
		
		QuickSort(array, start, mid);
		QuickSort(array, mid+1, end);
	}

}
