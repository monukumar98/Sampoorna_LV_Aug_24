package Binary_Search_Doubt_Class;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Paratha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(min_time(arr, p));

	}

	public static int min_time(int[] arr, int p) {
		int r = arr[arr.length - 1];
		int hi = (r * (p * (p + 1))) / 2;
		int lo = 1;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(arr, p, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] arr, int p, int time) {
		// TODO Auto-generated method stub
		int count_paratha = 0;
		for (int i = 0; i < arr.length; i++) {
			count_paratha += Cook_Paratha(arr[i], time);
			if (count_paratha >= p) {
				return true;
			}
		}
		return false;
	}

	public static int Cook_Paratha(int rank, int time) {
		int paratha = 1, sum = 0;
		while (sum + paratha * rank <= time) {
			sum += paratha * rank;
			paratha++;
		}
		return paratha - 1;

	}

}
