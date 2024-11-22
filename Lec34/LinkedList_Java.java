package Lec34;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> q = new LinkedList<>();
		q.add(10);// add last
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.remove());
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(110);
		q1.add(109);
		q1.add(1);
		q1.add(879);
		System.out.println(q1.remove());
//		ll.add(10);// add last O(1)
//		ll.add(20);
//		ll.add(30);
//		ll.add(40);
//		ll.add(50);
//		ll.addFirst(90);// O(1)
//		ll.add(1, -11);// O(N)
//		System.out.println(ll);
//		for (int val : ll) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.get(2));
//		System.out.println(ll.remove());// remove first O(1)
//		System.out.println(ll.remove(2));
//		System.out.println(ll.removeLast());// O(N)
//		System.out.println(ll);

	}

}
