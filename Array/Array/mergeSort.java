package Array;

import java.util.Scanner;


//array to be sorted in increasing order

public class mergeSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Write the size of array : ");
		int n = scn.nextInt();
		System.out.println("Write the elements of array : ");
		int[] arr = new int[n];
		
		for ( int i = 0 ; i < n ; i++ ) {
			arr[i] = scn.nextInt();
		}
		
		mergeSort(arr, 0, n);
		
		for ( int i = 0 ; i < n ; i++ ) {
			System.out.println(arr[i]);
		}
		
		scn.close();
	}
	public static void mergeSort(int[] array, int start, int end) {
		
		if ((end - start) < 2) {
			return;
		}
		int mid = (start + end)/2;
		
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		
		merge(array, start, mid, end);
		
	}
	public static void merge(int[] array, int start, int mid, int end) {
		
		// modification to check whether both the array are not already sorted
		if (array[mid-1] <= array[mid]) {
			return;
		}
		
		//temporary array to hold of enough memory to hold both arrays during merging
		int[] tempArray = new int[end - start] ;
		//starting index of first array to be merged
		int i = start ; 
		//starting index of second array to be merged
		int j = mid ;
		//index to hold the index of tempArray
		int temp = 0;
	    
		while (i < mid && j < end) {
			tempArray[temp++] = (array[i] <= array[j]) ? array[i++] : array[j++] ;
		}
		
		System.arraycopy(array, i, array, temp + start, mid - i);
		System.arraycopy(tempArray, 0, array, start, temp);
	}

}
