package Lec33;

public class LinkedList {

	private class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;

	private int size;

	// O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;

		} else {
			nn.next = head;
			head = nn;

		}
		size++;
	}

	// O(1)
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void AddatIndex(int item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("Bklol index range me do");
		}
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	// O(N)
	private Node GetNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	// O(1)
	public int getFirst() {
		return head.val;

	}

	// O(1)
	public int getLast() {
		return tail.val;

	}

	// O(N)
	public int getatIndex(int k) {
		return GetNode(k).val;
	}

	// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;

		}
		size--;
		return temp.val;
	}

	// O(N)
	public int removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node prev = GetNode(size - 2);
			int val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}
	}
	// O(N)
	public int removeatIndex(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol index range me do");
		}
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = GetNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}
	// O(1)
	public int size() {
		return size;
	}
}
