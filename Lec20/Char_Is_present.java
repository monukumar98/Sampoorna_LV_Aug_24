package Lec20;

public class Char_Is_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababababvakhgahcagjg";
		System.out.println(Is_present(s, 'a', 4));

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
