package Lec3;

import java.util.*;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int a=sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Mirror
			if (row < n) {
				star++;
				space--;

			} else {
				star--;
				space++;
			}
			// Next Row Prep
			System.out.println();
			row++;
		}

	}

}