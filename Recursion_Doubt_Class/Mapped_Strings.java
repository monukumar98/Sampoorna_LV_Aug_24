package Recursion_Doubt_Class;

import java.util.Scanner;

public class Mapped_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		Mapped(ques, "");

	}

	public static void Mapped(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		String s1 = ques.substring(0, 1);
		int num = Integer.parseInt(s1);
		Mapped(ques.substring(1), ans + (char) (64 + num));
		if (ques.length() >= 2) {
			String s2 = ques.substring(0, 2);
			int num1 = Integer.parseInt(s2);
			if (num1 <= 26) {
				Mapped(ques.substring(2), ans + (char) (64 + num1));
			}
		}

	}

}
