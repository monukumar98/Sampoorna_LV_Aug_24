package Lec51;

public class Distinct_subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";// coin
		String t = "rabbit";// amount
		System.out.println(Changes_II(s, t, 0, 0));

	}
// s--> coin --> i
// t--> amount--> j	

	public static int Changes_II(String s, String t, int i, int j) {
		if (j == t.length()) {// amount ==0
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Changes_II(s, t, i + 1, j + 1);

		}
		exc = Changes_II(s, t, i + 1, j);
		return inc + exc;

	}
}
