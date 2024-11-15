package Lec31;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calPoints(arr));
	}

	public static int calPoints(String[] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("D")) {
				int x = st.peek();
				st.push(2 * x);
			} else if (arr[i].equals("C")) {
				st.pop();
			} else if (arr[i].equals("+")) {
				int a = st.pop();
				int b = st.pop();
				int c = a + b;
				st.push(b);
				st.push(a);
				st.push(c);
			} else {
				st.push(Integer.parseInt(arr[i]));
			}

		}
		int sum = 0;
		for (int x : st) {
			sum += x;
		}
		return sum;
	}
}
