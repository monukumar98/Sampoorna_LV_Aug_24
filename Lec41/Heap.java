package Lec41;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) {// 7
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int pi, int ci) {
		int parent = list.get(pi);
		int child = list.get(ci);
		list.set(pi, child);
		list.set(ci, parent);

	}

	public int remove() {
		int val = list.get(0);
		swap(0, list.size() - 1);
		list.remove(list.size() - 1);
		downheapify(0);

		return val;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(lci) < list.get(mini)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(rci) < list.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public int get() {
		return list.get(0);
	}

	public int size() {
		return list.size();
	}

	public void Display() {
		System.out.println(list);
	}

}
