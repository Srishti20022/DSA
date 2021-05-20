package Array;

public class insertionSortByRecursion {

	public static void main(String[] args) {
	
		int[ ] arr = { 22  ,66  ,44  ,88  ,0  ,11  ,55 };
		insertion(arr, 7);
		for(int i =0; i<7 ; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public static void insertion(int input[], int n) {
		if(n < 2) {
			return;
		}
		
		insertion(input, n-1);
		
		int ele = input[n-1];//as n is the total number of elements in the array but the index 
		//would be one less than size of the array
		int i;
		for( i = n-1; i>0 && ( ele>input[i-1] ); --i ) {
			input[i] = input[i-1];
		}
		input[i] = ele;
	}

}
