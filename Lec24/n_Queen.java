package Lec24;

public class n_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int tq = n;
		NQueenPrint(board, tq, 0);

	}

	public static void NQueenPrint(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col) == true) {
				board[row][col] = true;
				NQueenPrint(board, tq - 1, row + 1);
				board[row][col] = false;
			}

		}
	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// upper part
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// left daigonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right daigonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
