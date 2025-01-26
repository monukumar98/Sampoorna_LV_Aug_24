package Recursion_Doubt_Class;

import java.util.Scanner;

public class Vivek_Loves_Array_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Vivek_Loves_Array(arr, 0, n-1));
		}

	}

	public static int Vivek_Loves_Array(int[] arr, int si, int ei) {
		if (si >= ei) {
			return 0;
		}
		for (int mid = si; mid < ei; mid++) {
			int sum1 = 0;
			for (int i = si; i <= mid; i++) {
				sum1 += arr[i];
			}
			int sum2 = 0;
			for (int i = mid + 1; i <= ei; i++) {
				sum2 += arr[i];
			}
			if (sum1 == sum2) {
				int left = Vivek_Loves_Array(arr, si, mid);
				int right = Vivek_Loves_Array(arr, mid + 1, ei);
				return Math.max(left, right) + 1;// apna wala
			}
		}
		return 0;

	}

}
