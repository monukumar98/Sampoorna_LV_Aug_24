package Lec7;

public class Arrays_Maximum_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 4, 11, 40, 51, 1, 15 };
		System.out.println(max1(arr));
		System.out.println(max2(arr));
	}

	public static int max2(int[] arr) {
		int m = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(m, arr[i]);

		}
		return m;
	}

	public static int max1(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}
}
