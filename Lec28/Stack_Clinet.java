package Lec28;

public class Stack_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.pop());
		st.Display();
		System.out.println(st.peek());
		st.push(60);
		st.Display();
	//	st.push(70);
		

	}

}
