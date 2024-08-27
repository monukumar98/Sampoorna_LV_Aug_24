package Lec6;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3898;
		System.out.println(Count(n));

	}

	public static int Count(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;

	}

}
