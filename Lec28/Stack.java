package Lec28;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public int size() {
		return idx + 1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bklol stack full hai ");
		}
		idx++;
		arr[idx] = item;

	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack Empty hai ");
		}
		return arr[idx];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack Empty hai ");
		}
		int v = arr[idx];
		idx--;
		return v;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
