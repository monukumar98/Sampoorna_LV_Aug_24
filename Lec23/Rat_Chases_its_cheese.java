package Lec23;

import java.util.*;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		Print(maze, 0, 0, ans);
		if (f == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean f = false;

	public static void Print(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			Dispaly(ans);
			f = true;
			// maze[cr][cc] = 'O';
			// ans[cr][cc] = 0;
			return;
		}
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, -1, 0, 1 };
		for (int i = 0; i < dc.length; i++) {// 4 times
			Print(maze, cr + dr[i], cc + dc[i], ans);
		}
//		Print(maze, cr - 1, cc, ans);// up
//		Print(maze, cr, cc - 1, ans);// left
//		Print(maze, cr + 1, cc, ans);// down
//		Print(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Dispaly(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
