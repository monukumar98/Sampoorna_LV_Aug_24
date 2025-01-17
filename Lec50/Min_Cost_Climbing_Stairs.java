package Lec50;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero = Min_Cost(arr, 0);
		int first = Min_Cost(arr, 1);
		System.out.println(Math.min(zero, first));

	}

	public static int Min_Cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;

		}
		int f1 = Min_Cost(arr, i + 1);
		int f2 = Min_Cost(arr, i + 2);
		return arr[i] + Math.min(f1, f2);// dp[i]=arr[i]+ Math.min(dp[i-1], dp[i-2])
	}

}
