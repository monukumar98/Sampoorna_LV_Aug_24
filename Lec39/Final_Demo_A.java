package Lec39;

public class Final_Demo_A {
	final int x;

	public Final_Demo_A(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}

	public final void fun() {
		System.out.println("FUN IN Final_Demo_A");
	}

	public void fun1() {
		System.out.println("FUN1 IN Final_Demo_A");
	}

	public static void main(String[] args) {
		Final_Demo_A f = new Final_Demo_A(9);

	}
}
