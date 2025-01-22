package Lec52;

public class Minimum_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Minimum_path(maze, 0, 0));
	}

	public static int Minimum_path(int[][] maze, int cr, int cc) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			return maze[cr][cc];
		}
		if(cr>=maze.length || cc>=maze[0].length) {
			return Integer.MAX_VALUE;
		}
		int left = Minimum_path(maze, cr, cc + 1);
		int right = Minimum_path(maze, cr + 1, cc);
		return Math.min(left, right) + maze[cr][cc];
	}

}
