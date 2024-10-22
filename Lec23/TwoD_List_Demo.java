package Lec23;

import java.util.*;

public class TwoD_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		ll.add(new ArrayList<Integer>());
		ll.add(new ArrayList<Integer>());
		ll.add(new ArrayList<Integer>());
		ll.get(1).add(2);
		ll.get(1).add(9);
		System.out.println(ll);
		System.out.println(ll.get(1).get(0));
		System.out.println(ll.size());
	}

}
