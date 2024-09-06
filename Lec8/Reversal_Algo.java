package Lec8;

public class Reversal_Algo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		k = k % n;// Cycle remove krne ke liye
		// starting ke n-k element Revese krna hai
		Revese(arr, 0, n - k - 1);

		// last ke k element Revese krna hai
		Revese(arr, n - k, n - 1);

		// all element Revese krna hai
		Revese(arr, 0, n - 1);

	}

	public static void Revese(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
