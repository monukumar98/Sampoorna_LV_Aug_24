package Lec24;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 120;
		System.out.println(PrimeSieve(n));

	}

	public static int PrimeSieve(int n) {
		int[] prime = new int[n + 1];
		prime[0] = 1;// ye index not prime number hai
		prime[1] = 1;// ye index not prime number hai
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == 0) {// ye prime
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}

			}

		}
		int c = 0;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == 0) {
				c++;
			}
		}
		return c;
	}

}
