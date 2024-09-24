package Lec15;

import java.util.ArrayList;

public class ArrayList_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();// 10
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(33);
		ll.add(1, -9);
		ll.add(301);
		ll.add(21);
		ll.add(313);
		ll.add(-91);
		System.out.println(ll.size());
		ll.add(7);
		System.out.println(ll);
	}

}
