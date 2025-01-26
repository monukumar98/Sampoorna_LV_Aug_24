package Recursion_Doubt_Class;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		int target = 3;
		System.out.println("\n"+SubSet(arr, 0, 0, "", target));

	}

	public static int SubSet(int[] arr, int i, int sum, String ans, int target) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			} else {
				return 0;
			}
		}
		int x = SubSet(arr, i + 1, sum + arr[i], ans + arr[i] + " ", target);
		int y = SubSet(arr, i + 1, sum, ans, target);
		return x + y;
	}

}
