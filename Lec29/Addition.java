package Lec29;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 9));
		System.out.println(add(2, 3, 9.8));
		System.out.println(add(2, 3, 4, 4, 4, 9, 4, 4, 4, 4, 4, 4, 4, 4, 4, 11, 4, 4, 40));
//		System.out.println(add(2, 3, 9, 8));
//		System.out.println(add(2, 4, 9));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
//	public static void add(int a, int b, int c) {
//		
//	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
