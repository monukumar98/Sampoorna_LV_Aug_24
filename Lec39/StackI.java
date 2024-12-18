package Lec39;

public interface StackI {
	public void push(int item);

	int x = 96;// public static final

	public int pop(int item);

	public int peek(int item);

	// java 8
	public static void fun() {
//		fun1();//

	}

	default void fun1() {

	}
	// java 9
	private void fun3() {
		
	}
	private static  void fun4() {
		
	}

}
