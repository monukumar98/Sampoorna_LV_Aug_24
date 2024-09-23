package Lec14;

public class String_demo_2 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s + 10 + 40 + 'a' + "bye");
		System.out.println(10 + 40 + s + "bye");
		System.out.println(s + (10 + 40) + "bye");
		System.out.println(s.length());
		int[] arr = new int[4];
		System.out.println(arr.length);
		System.out.println(s.charAt(4));
		
	}
}
