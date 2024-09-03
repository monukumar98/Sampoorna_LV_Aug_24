package Lec7;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 4, 11, 40, 51, 1, 15 };
		int item = 4;
		System.out.println(Search(arr, item));

	}

	public static int Search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;

	}

}
