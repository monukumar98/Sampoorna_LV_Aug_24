package Lec44;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(NthMagic_Number(n));

	}

	public static int NthMagic_Number(int n) {
		int sum = 0, mul = 5;
		while (n > 0) {
			if ((n & 1) != 0) {// (n%2!=0)
				sum += mul;
			}
			mul = mul * 5;
			n = n >> 1;// n = n/2

		}
		return sum;
	}

}
