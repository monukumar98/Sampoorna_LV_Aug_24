package Lec7;

public class Arrays_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 4, 7 };
		// int[] ar = new int[] { 10, 20, 30, 4, 7 };
		System.out.println(arr[0] + " " + arr[1]);//10 20
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
