package Lec43;

import java.util.HashSet;

public class longest_consecutive_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 4, 200, 1, 3, 2 };
		System.out.println(longest_consecutive(arr));
	}

	public static int longest_consecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i] - 1)) {
				int c = 0;
				int v = arr[i];
				while (set.contains(v)) {
					   set.remove(v);
					c++;
					v++;
				}
				ans = Math.max(ans, c);
			}
		}
		return ans;

	}
}
