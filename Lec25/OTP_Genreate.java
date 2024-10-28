package Lec25;

import java.util.Random;

public class OTP_Genreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int si = 0;
//		int ei = 9;
//		Random rn = new Random();
//		for (int i = 0; i <6; i++) {
//			int v = rn.nextInt(ei - si + 1)+si;
//			System.out.print(v);
//
//		}
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int si = 0;
		int ei = 35;
		Random rn = new Random();
		for (int i = 0; i <6; i++) {
			int v = rn.nextInt(ei - si + 1) + si;
			System.out.print(arr[v]);

		}
	}
}