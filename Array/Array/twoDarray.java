package Array;

import java.util.Scanner;

public class twoDarray {
//input and output 2D array
	public static void main(String[] args) {
		int[][] arr;
		System.out.println("Write the number of rows of 2D array :");
		Scanner s = new Scanner(System.in);
		int c;

		int r = s.nextInt();
		arr = new int[r][];
		for (int i = 0; i < r; ++i) {
			System.out.println("Wite the number of columns for row with index " + i + " : ");
			c = s.nextInt();
			arr[i] = new int[c];
			for (int j = 0; j < c; ++j) {
				System.out.println("Write element for row " + i + " column " + j + " : ");
				arr[i][j] = s.nextInt();

			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		wavepattern(arr);

	}

	// to print spiral pattern of a 2d array
	private static void wavepattern(int[][] arr) {
		int flag = 0;
		System.out.println("Wave pattern of the array is as follows : ");
		for (int i = 0; i < arr.length; i++) {
			if (flag == 0) {
				flag = 1;
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
			} else {
				flag = 0;
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}
