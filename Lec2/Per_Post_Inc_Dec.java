package Lec2;

public class Per_Post_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
//		System.out.println(--a);
//		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(a);
//		int x = a++ + a-- - 2;//13
		int x = a++ + a-- - --a - 2 - ++a + --a + a++;
		System.out.println(x);

	}

}
