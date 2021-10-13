package Heaps;

public class main {

	public static void main(String[] args) {
		Heap h = new Heap(8);
//		for(int i = 1; i <= 3; i++) {
//			h.insert(i);
//		}
		h.insert(80);
		h.insert(75);
		h.insert(60);
		h.insert(68);
		h.insert(55);
		h.insert(40);
		h.insert(52);
		h.insert(67);
//		h.insert(99);
//		h.insert(11);
//		int root = h.peek();
//		System.out.println(root);
//		h.delete(0);
//		h.printHeap();
		h.heapSort();
		h.printHeap();
	}

}
