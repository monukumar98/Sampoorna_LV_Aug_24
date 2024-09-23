package Lec14;

public class Unique_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vansh";
		System.out.println(Unique(s));

	}

	public static boolean Unique(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 97] = freq[ch - 97] + 1;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 1) {
				return false;
			}
		}
		return true;
	}

}
