package Heaps;

public class Heap {
	
	private int[] heap;
	private int size;
	
	public void heapSort() {
		int lastHeapIndex = size-1;
		for(int i = 0; i < lastHeapIndex; i++) {
			int temp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = temp;
			fixHeapBelow(0, lastHeapIndex-i-1);
		}
	}
	
	public void printHeap() {
		for(int i = 0; i < size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	
	public Heap(int capacity) {
		heap = new int[capacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getChild(int index, boolean left) {
		return (2*index + (left ? 1 : 2));
	}
	
	public boolean isFull() {
		return size == heap.length;
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	
	public void insert(int value) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
		heap[size] = value;
		fixHeapAbove(size);
		size++;
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		while(index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			if(leftChild <= lastHeapIndex) {
//				right child does not exist
				if(rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				}else {
					childToSwap = (heap[leftChild] > heap[rightChild]) ? leftChild : rightChild;
				}
				if(heap[index] < heap[childToSwap]) {
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				}else {
					break;
				}
				index = childToSwap;
			}else {
				break;
//				When no child exist
			}
		}
	}
	public int delete(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		
		int del_ele = heap[index];
		heap[index] = heap[size-1];
		if(index == 0 || heap[index] < heap[getParent(index)]) {
			fixHeapBelow(index, size-1);
		} else {
			fixHeapAbove(index);
		}
		size--;
		return del_ele;
	}
	
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		
		while(index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		
		heap[index] = newValue;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		
		return heap[0];
	}
	
}
