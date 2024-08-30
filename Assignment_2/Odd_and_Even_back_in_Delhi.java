package Assignment_2;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 0) {
			int car_no = sc.nextInt();
			Odd_and_Even(car_no);
			n--;
		}

	}

	public static void Odd_and_Even(int n) {
		int oddsum = 0;
		int evensum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				evensum += rem;
			} else {
				oddsum += rem;
			}
			n = n / 10;
		}
		if (evensum % 4 == 0 || oddsum % 3 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
