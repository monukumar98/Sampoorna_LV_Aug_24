package Lec10;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(MooreVoting(arr));
	}

	public static int MooreVoting(int[] arr) {
		int e = arr[0];
		int vote = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == e) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					e = arr[0];
					vote = 1;
				}
			}
		}
		return e;

	}
}
