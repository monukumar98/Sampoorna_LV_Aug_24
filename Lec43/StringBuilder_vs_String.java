package Lec43;

public class StringBuilder_vs_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Demo();
		//Stringbuilder_Demo();

	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}

	}

	public static void Stringbuilder_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
	}

}
