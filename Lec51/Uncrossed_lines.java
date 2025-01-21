package Lec51;

public class Uncrossed_lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 5, 1, 2, 5 };
		int[] arr2 = { 10, 5, 2, 1, 5, 2 };
		System.out.println(LCS(arr1, arr2));

	}

	public static int LCS(int[] s1, int[] s2) {
		int[][] dp = new int[s2.length + 1][s1.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s2[i - 1] == s1[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}
}
