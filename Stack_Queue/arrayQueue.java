package Stacks;

public class arrayQueue {
	
	private char[] queue;
	private int front;
	private int last;
	public arrayQueue(int capacity) {
		queue = new char[capacity];
	}
	public int size() {
		return last;
	}
	public void addToLast(char ch) {
		if(last==queue.length) {
			char[] char1 = new char[2*queue.length];
			System.arraycopy(queue, 0, char1, 0, queue.length);
			queue=char1;
		}
		queue[last++] = ch;
	}
	public char removeFromFront() {
		if(last == front) {
			System.out.println("queue is empty");
		}
   		char remove = queue[front++];
		return remove;
	}
	public void printQueue() {
		for (int i = last-1; i >=front; i--) {
			System.out.println(queue[i]);
			System.out.println("----");
		}
	}

}
