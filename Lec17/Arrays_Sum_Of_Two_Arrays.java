package Lec17;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 2, 9 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		Sum_Of_Two_Arrays(arr1, arr2);
	}

	public static void Sum_Of_Two_Arrays(int[] arr1, int[] arr2) {
		int i = arr1.length - 1, j = arr2.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			list.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + arr1[i];
			list.add(sum % 10);
			carry = sum / 10;

			i--;
		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			list.add(sum % 10);
			carry = sum / 10;

			j--;
		}
		if (carry != 0) {
			list.add(carry);
		}
		// Collections.reverse(list);//reverse// for(int k=0; k<list.size(); k--)
		for (int k = list.size() - 1; k >= 0; k--) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.println("END");

	}

}
