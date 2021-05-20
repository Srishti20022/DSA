package Stacks;

import java.util.Scanner;

// to check whether a string is pallindrome or not using stacks and while testing ignoring the 
//spaces and symbols between alphabets and the cases also
public class main {

	public static void main(String[] args) {
//		
//		arr.addToLast('a');
//		
//		arr.addToLast('b');
//		arr.addToLast('c');
//		arr.addToLast('d');
//		arr.addToLast('f');
//		arr.addToLast('e');
//		arr.removeFromFront();
//		arr.removeFromFront();
//		
//		arr.printQueue();
		
		Scanner scn = new Scanner(System.in);
		String string = scn.nextLine();
		int i = string.length();
		//System.out.print(i);
		ArrayStack stack1 = new ArrayStack(i);
		arrayQueue queue = new arrayQueue(i);
		for (int j = 0; j < i; ++j) {
			char c = string.charAt(j);
			if ((c <= 'z' && c >= 'a')) {
				stack1.push(Character.toUpperCase(c));
				queue.addToLast(Character.toUpperCase(c));
			} else if ((c <= 'Z' && c >= 'A')) {
				stack1.push(c);
				queue.addToLast(c);
			}
		}
		
		//stack1.printStack();
		int j = stack1.size();
//		char[] ch = new char[stack1.size()];
//		for (i = j - 1; i >= 0; i--) {
//			ch[i] = stack1.pop();
//		}
//		int k =0;
		int Flag =0;
		for (i = j - 1; i > j/2; i--) {
			if(queue.removeFromFront()!=stack1.pop()) {
				Flag = 1;
				break;
			}
		}
		if(Flag==1) {
			System.out.println("not pallindrome");
		} else {
			System.out.println("pallindrome");
		}

		scn.close();
	}

}
