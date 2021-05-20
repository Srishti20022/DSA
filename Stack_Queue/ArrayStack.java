package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private char[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
			stack = new char[capacity];
	}
	public int size() {
		return top;
	}
	
	public void push(char ch) {
		//top would give the total number of elements stored in the character array
		// top will always have index one greater than the topmost element index
		if(top==stack.length) {
			char[] char1 = new char[2*stack.length];
			System.arraycopy(stack, 0, char1, 0, stack.length);
			stack=char1;
		}
		stack[top++] = ch;
	}
	
	public char pop() {
		if(top==0) {
			throw new EmptyStackException();
			}
		char remove = stack[--top];
		return remove;
	}
	
	public char peek() {
		if(top == 0) {
			throw new EmptyStackException();
		}
		return(stack[top-1]);
	}
	
	public void printStack() {
		for (int i = size()-1; i >=0; i--) {
			System.out.println(stack[i]);
			System.out.println("----");
		}
	}

}
