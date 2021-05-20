
package Array;

 import java.util.Scanner;
public class LinearBinaryBubbleSelectionInsertion {
	public static int[] arr = null;
	public static int n;

	public static void main(String[] args) {
		System.out.println("Wrie the size of array : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		arr = new int[n];

		System.out.println("Write the members of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		Interface();
		s.close();
		
	}

	private static void Interface() {
		int n = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Operation to be take place \n ");
			System.out.println("1. Search an element ");
			System.out.println("2. Sorting of array (in increasing order)");
			System.out.println("3. Exit ");
			System.out.println("ENTER CHOICE ");
			n = s.nextInt();
s.close();
			if (n == 1) {
				Searching();
			} else if (n == 2) {
				Sorting();
			} else if (n == 3) {
				System.exit(1);
			}

		}
	

	}

	private static void Searching() {
		int n = 0;
		System.out.println("Write the element to be searched : ");
		Scanner s = new Scanner(System.in);
		int ele = s.nextInt();
		s.close();
		while (true) {

			System.out.println("1. To search element through linear search .");
			System.out.println("2. To search element through binary search ( array should be in increasing order)");
			System.out.println("3. Exit");
			System.out.println("ENTER CHOICE ");
			n = s.nextInt();

			if (n == 1) {
				Linear(ele);
			} else if (n == 2) {
				Binary(ele);
			} else if (n == 3) {
				Interface();
			}
		}
	}

	private static void Sorting() {
		int n;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1. To sort element through bubble sort .");
			System.out.println("2. To sort element through insertion sort .");
			System.out.println("3. To sort element through selection sort .");
			System.out.println("4. Exit");
			System.out.println("ENTER CHOICE ");
			n = s.nextInt();
            s.close();
			if (n == 1) {
				Bubble();
			} else if (n == 2) {
				Insertion();
			} else if (n == 3) {
				Selection();
			}
	else if (n == 4) {
				Interface();
			}

		}

	}

	private static void Linear(int ele) {
		int flag = -1;
		for (int i = 0; i < n && flag == -1; ++i) {
			if (ele == arr[i]) {
				flag = 1;
				System.out.println("Element " + ele + " is at index " + i);
			}

		}
		if (flag != 1) {
			System.out.println("Element not found in the given array !!!");
		}
		Searching();

	}

	private static void Binary(int ele) {
		int f = 0, l = n - 1, mid, flag = -1; // f stants for first and l stands last
		while (f <= l && flag == -1) {
			mid = (f + l) / 2;
			if (arr[mid] > ele) {
				l = mid - 1;
			}
			else if (arr[mid] < ele) {
				f = mid + 1;
			} else {
				flag = 1;
				System.out.println("Element " + ele + " is at index " + mid);
			}
		}
		if (flag == -1) {
			System.out.println("Element not found in the given array !!!");
		}
		Searching();
	}

	private static void Show() {
		System.out.println("Sorted array is as follows :  ");
		for (int i = 0; i < n; ++i) {
			System.out.print("  " + arr[i] + "  ");
		}
		System.out.println();
	}

	private static void Bubble() {
		int temp;
		for (int i = 0; i <= n - 2; ++i) {
			for (int j = 0; j <= n-i-2; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		Show();
	}
	private static void Insertion() {
		int val;
		for(int i =1; i<n; ++i ) {
			for(int j = i-1;j>=0;j--) {
				val= arr[j+1];
				if(arr[j]>val) {
					arr[j+1]=arr[j];
					arr[j]=val;
				}
			}
		}
		Show();
	}
	private static void Selection() {
		int temp;
		for(int i = 0;i<=n-2;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		Show();
	}

}
