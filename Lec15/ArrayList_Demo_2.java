package Lec15;

import java.util.ArrayList;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(2);
		ll.add(33);
		ll.add(1, -9);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();

		int[] arr = { 2, 3, 5, 1, 4, 11, 40, 51, 1, 15 };
		// for each loop

		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : ll) {
			System.out.print(v + " ");
		}
	}

}
