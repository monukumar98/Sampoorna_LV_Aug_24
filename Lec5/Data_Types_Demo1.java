package Lec5;

import java.util.Scanner;

public class Data_Types_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte) (189);
		byte b = (byte) (420);
		short s = 67;
		int i = 89;
		long l = 7956766755l;
		System.out.println(b);
		b = 78;
		i = b;
		byte b1 = 89;
		Scanner sc = new Scanner(System.in);
//		b=sc.nextByte();
//		s=sc.nextShort();
//		i=sc.nextInt();
//		l=sc.nextLong();
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
		int c = 2147483647;
		System.out.println(c);
		c++;
		System.out.println(c);
		int x = (int) (2147483648l);
		System.out.println(x);

	}

}
