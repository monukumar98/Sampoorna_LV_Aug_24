package Lec15;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(33);
		ll.add(1, -9);// index, element --> index size--> O(N)
		System.out.println(ll);
		System.out.println(ll.size());
		// get
		System.out.println(ll.get(3));
		// update
		ll.set(2, 110);
		System.out.println(ll);
		// remove
		System.out.println(ll.remove(2));
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);

	}

}
