package Array;

// Using stable counting sort in radix sort

public class stableCountingSort {

	public static void main(String[] args) {

		int[] ar = { 1235, 9731, 9839, 7385, 8341, 9010, 5268, 1482, 6724, 1553 };
		radixSort(ar, 10, 4);
		for(int value : ar) {
			System.out.print(value + " ");
		}

	}

	public static void radixSort(int[] input, int radix, int width) {

		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}
	}

	public static void radixSingleSort(int[] input, int position, int radix) {

		int numItems = input.length;
		int[] count = new int[numItems];

		for (int value : input) {
			count[getDigit(position, value, radix)]++;
		}
		for(int j = 1; j < numItems; j++) {
			count[j] += count[j-1];
		}
		int [] temp = new int[numItems] ;
		for( int i = numItems-1 ;i>=0 ;i--) {
			temp[--count[getDigit(position, input[i],radix)]]= input[i];
		}
		System.arraycopy(temp, 0, input, 0, numItems);

	}

	public static int getDigit(int position, int value, int radix) {
		return ((value / (int) Math.pow(10, position)) % 10);
	}

}
