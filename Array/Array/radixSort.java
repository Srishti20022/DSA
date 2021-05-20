package Array;
// Sorting  the following values using radix sort
// "bcedef" , "dbaqc" , "abcde" , "omadd" , "bbbbb"


public class radixSort {

	public static void main(String[] args) {
		
		String [] str = {"bcdef" , "dbaqc" , "abcde" , "omadd" , "bbbbb"};
		radixSort1(str, 26, 5);
		System.out.println("Sorted array is ");
		// radix is 26 as there are total 26 alphabets
		for(int i = 0; i < 5; ++i)
			System.out.print(str[i] + " ");

	}
	
	public static void radixSort1(String[] input, int radix, int width) {
		for (int i = width-1; i >= 0; i--) {
			radixSingleSort(input, i, radix);
		}
	}
	
	public static void radixSingleSort(String[] input, int i, int radix) {
		int numItems = input.length;
		int[] count = new int[radix];
		
		for(int value=0; value<numItems; value++) {
			int a = input[value].charAt(i);
			count[a-97]++;
		}
		
		
		for( int j = 1; j < radix ; j++) {
			count[j] += count[j-1];
		}
		String[] temp = new String[numItems];
		for(int j = numItems-1; j>=0; --j) {
			int a = input[j].charAt(i);
			temp[--count[a-97]] = input[j];
		}
		System.arraycopy(temp, 0, input, 0, numItems);
		
	}

}
