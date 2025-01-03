package Lec45;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	
	private ArrayList<Node> bukt;
	private int size = 0;

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}

	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public int Hashfun(K key) {
		int idx = key.hashCode() % bukt.size();// -2^31 to 2^31
		if (idx < 0) {
			idx += bukt.size();
		}
		return idx;

	}

	public void put(K key, V value) {
		int idx = Hashfun(key);// 1
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = bukt.get(idx);
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			Rehashing();
		}
	}

	private void Rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> old_buk = bukt;
		bukt = new ArrayList<>();
		size = 0;
		for (int i = 0; i < 2 * old_buk.size(); i++) {
			bukt.add(null);
		}
		for (Node temp : old_buk) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
	}

	public int size() {
		return size;
	}

	public boolean containsKey(K key) {
		int idx = Hashfun(key);// 1
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int idx = Hashfun(key);// 1
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int idx = Hashfun(key);// 1
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			bukt.set(idx, curr.next);
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		size--;
		return curr.value;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}
		}
		s += "}";
		return s;
	}
}
