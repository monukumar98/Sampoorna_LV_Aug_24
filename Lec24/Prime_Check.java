package Lec24;

public class Prime_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(isPrime(n));

	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}

			i++;
		}
		return true;
	}

}
