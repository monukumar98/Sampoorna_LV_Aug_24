package Lec12;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// row
		int[][] arr = new int[n][];
	//	System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			int m = sc.nextInt();// col
			arr[i] = new int[m];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
