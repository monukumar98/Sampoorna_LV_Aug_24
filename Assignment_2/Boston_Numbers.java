package Assignment_2;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ISBoston_Numbers(n));

	}

	public static int ISBoston_Numbers(int n) {
		int sum_digit = Sumofdigit(n);
		int sum = 0;
		int i = 2;
		while (i <= n) {
			if (n % i == 0) {
				sum = sum + Sumofdigit(i);
				n = n / i;
			} else {
				i++;
			}
		}
		if (sum_digit == sum) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int Sumofdigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

}
