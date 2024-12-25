package Lec42;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println(Kth_Largest_Element(arr, k));
	}

	public static int Kth_Largest_Element(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {
				pq.poll();// remove
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
}
