package Lec44;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(CountSet_Bit(n));
		System.out.println(Fast_CountSet_Bit(n));

	}

	public static int Fast_CountSet_Bit(int n) {
		int c = 0;
		while (n > 0) {
			n = (n & (n - 1));
			c++;
		}
		return c;
	}

	public static int CountSet_Bit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n = n >> 1;// n = n/2;
		}
		return c;
	}
}
