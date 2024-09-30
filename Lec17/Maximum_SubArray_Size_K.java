package Lec17;

public class Maximum_SubArray_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 2, 3, 7, 6, 8, 2, 3 };
		int k = 3;
		System.out.println(MaxiumSum(arr, k));

	}

	public static int MaxiumSum(int[] arr, int k) {
		int sum = 0;
		int ans = 0;
		// 1st window kaam pehle krna hai
		for (int i = 0; i < k; i++) {
			sum += arr[i];// sun
		}
		ans = sum;
		// remaing
		for (int i = k; i < arr.length; i++) {
			// grow
			sum += arr[i];
			// shrink
			sum -= arr[i - k];
			// ans
			ans = Math.max(ans, sum);

		}
		return ans;

	}
}
