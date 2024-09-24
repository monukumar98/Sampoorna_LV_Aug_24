package Lec15;

public class String_to_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "5657897";
		int n = Integer.parseInt(s);
		System.out.println(n);
		String s1 = "565877878797897";
		long l = Long.parseLong(s1);
		System.out.println(l);
		System.out.println(Convert_Number(s));
	}

	public static int Convert_Number(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ans = ans * 10 + (s.charAt(i) - 48);
		}
		return ans;
	}
}
