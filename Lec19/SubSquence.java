package Lec19;

public class SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Print(s, "");
	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans);
		Print(ques.substring(1), ans + ch);

	}

}
