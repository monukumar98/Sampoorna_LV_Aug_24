package Lec28;

//import java.util.Queue;
import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
	//	Queue<Integer> q = new Queue<>();
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		// get
		System.out.println(st.peek());
		// delete
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		for (int v : st) {
			System.out.print(v + " ");
		}

	}

}
