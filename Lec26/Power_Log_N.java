package Lec26;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		System.out.println(pow(a, n));

	}

	public static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = pow(a, n / 2);
		ans = ans * ans;
		if (n % 2 == 1) {
			ans *= a;
		}
		return ans;
	}
}
