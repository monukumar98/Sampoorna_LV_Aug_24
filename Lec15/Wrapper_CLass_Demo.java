package Lec15;

public class Wrapper_CLass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Long l = 77l;
		long l1 = 78664567865l;
		a = a1;// autoBoxing
		l = l1;
		// unBoxing
		Integer x = 8990;
		int y = 789;
		y = x;
		System.out.println(y);
		Float f = 82.9f;
		Double d = 3.38;
		Integer b1 = 10;
		Integer b2 = 10;
		Integer b3 = 127;
		Integer b4 = 127;
		System.out.println(b1 == b2);// true
		System.out.println(b3 == b4);// false
		Boolean c1 = false;
		Boolean c2 = false;
		System.out.println(c1 == c2);//true 
		Character ch1 = 'ÿ';				
		Character ch2 = 'ÿ';
		System.out.println(ch1 == ch2);
//		char ch=(char) (143);
	System.out.println(ch2);

	}

}
