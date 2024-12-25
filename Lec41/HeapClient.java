package Lec41;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PriorityQueue<Integer> hp = new PriorityQueue<>();//min heap
		PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());// max heap
		// Heap hp = new Heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(20);
		hp.add(2);
//		System.out.println(hp.get());// hp.peek();
//		hp.Display();
		System.out.println(hp);
		System.out.println(hp.remove());// hp.pop();
		System.out.println(hp);
	}

}
