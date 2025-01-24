package Lec53;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		int[][] dp = new int[boys.length][girls.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(min_diff(boys, girls, 0, 0, dp));

	}

// i--> boys j-->girls
	public static int min_diff(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 878089;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int pair = Math.abs(boys[i] - girls[j]) + min_diff(boys, girls, i + 1, j + 1, dp);
		int reject = min_diff(boys, girls, i, j + 1, dp);
		return dp[i][j] = Math.min(pair, reject);

	}

}
