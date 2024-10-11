package Lec20;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		// Print(s, "");
		// System.out.println();
		// System.out.println("\n" + count);
		System.out.println("\n"+CountSubsence(s, ""));
	}

	public static int CountSubsence(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = CountSubsence(ques.substring(1), ans);
		int y = CountSubsence(ques.substring(1), ans + ch);
		return x + y;

	}

//	static int count = 0;

//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans + " ");
//			count++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);
//		Print(ques.substring(1), ans + ch);
//
//	}
}
