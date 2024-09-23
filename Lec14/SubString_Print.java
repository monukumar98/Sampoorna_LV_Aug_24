package Lec14;

public class SubString_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		PrintSubString(s);

	}

	public static void PrintSubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str=s.substring(i, j);
//				System.out.println(s.substring(i, j));
				System.out.println(str);
			}
		}
	}

}
