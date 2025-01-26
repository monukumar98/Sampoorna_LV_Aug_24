package Recursion_Doubt_Class;

import java.util.Scanner;

public class Split_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(SubSet(arr, 0, 0, "", 0, ""));
	}

	public static int SubSet(int[] arr, int i, int sum1, String ans1, int sum2, String ans2) {
		if (i == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);
				return 1;
			}
			return 0;
		}
		int x = SubSet(arr, i + 1, sum1 + arr[i], ans1 + arr[i] + " ", sum2, ans2);
		int y = SubSet(arr, i + 1, sum1, ans1, sum2 + arr[i], ans2 + arr[i] + " ");
		return x + y;
	}

}
