package Lec21;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "A";
		String hlp = "B";
		String des = "C";
		int n = 3;
		TOh(n, src, hlp, des);

	}

	public static void TOh(int n, String src, String hlp, String des) {
		if (n == 0) {
			return;
		}
		TOh(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th disk from " + src + " to " + des);
		TOh(n - 1, hlp, src, des);
	}

}
