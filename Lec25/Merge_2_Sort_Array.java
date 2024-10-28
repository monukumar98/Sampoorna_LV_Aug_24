package Lec25;

public class Merge_2_Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 7, 8 };
		int[] arr2 = { 1, 3, 5, 8, 9, 11, 13 };
		int []a=Merge(arr1, arr2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int n = arr1.length, m = arr2.length;
		int[] ans = new int[n + m];
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}

}
