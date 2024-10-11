package Lec20;

public class Permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);// i+1 se completev same char nhi hona chahiye
			if (Is_present(ques, ch, i + 1) == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

	}

	public static boolean Is_present(String s, char ch, int idx) {
		for (int i = idx + 1; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				return true;
			}
		}
		return false;

	}

}
