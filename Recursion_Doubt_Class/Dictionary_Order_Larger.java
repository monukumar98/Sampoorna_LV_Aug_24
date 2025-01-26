package Recursion_Doubt_Class;

import java.util.*;

public class Dictionary_Order_Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		List<String> ll = new ArrayList<>();
		print(ques, "", ques, ll);
		Collections.sort(ll);
		for (String s : ll) {
			System.out.println(s);
		}

	}

	public static void print(String ques, String ans, String original, List<String> ll) {
		if (ques.length() == 0) {
			if (ans.compareTo(original) > 0) {
				ll.add(ans);
			}
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			print(s1 + s2, ans + ch, original, ll);
		}
	}

}
