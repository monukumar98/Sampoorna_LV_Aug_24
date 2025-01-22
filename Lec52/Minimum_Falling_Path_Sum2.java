package Lec52;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[maze.length][maze[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MIN_VALUE);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < maze[0].length; i++) {
			ans = Math.min(ans, Minimum_path(maze, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Minimum_path(int[][] maze, int cr, int cc, int[][] dp) {
		if (cr == maze.length - 1) {
			return maze[cr][cc];
		}
		if (dp[cr][cc] != Integer.MIN_VALUE) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < dp[0].length; col++) {
			if (col == cc) {
				continue;
			}
			ans = Math.min(ans, Minimum_path(maze, cr + 1, col, dp));
		}
		return dp[cr][cc]=ans+maze[cr][cc];
	}

}
