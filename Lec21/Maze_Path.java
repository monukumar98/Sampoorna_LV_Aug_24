package Lec21;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// no of row
		int m = 4;// no of col
		PrintPath(0, 0, n - 1, m - 1, "");

	}

	// cr--> curr row cc--> current col er--> end row ec--> end col
	public static void PrintPath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}
		PrintPath(cr, cc + 1, er, ec, ans + "H");
		PrintPath(cr + 1, cc, er, ec, ans + "V");
	}

}
