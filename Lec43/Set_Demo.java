package Lec43;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(2);
		set.add(72);
		set.add(-12);
		set.add(102);
		set.add(90);
		set.add(-2);
		set.add(102);
		// set.add(null);
		System.out.println(set);
//		// get-->contains
//		System.out.println(set.contains(23));
//		System.out.println(set.contains(2));
//		// remove
//		System.out.println(set.remove(90));
//		//System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(2);
		set1.add(72);
		set1.add(-12);
		set1.add(102);
		set1.add(90);
		set1.add(-2);
		set1.add(102);
		// set1.add(null);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(2);
		set2.add(72);
		set2.add(-12);
		set2.add(102);
		set2.add(90);
		set2.add(-2);
		set2.add(102);
		// set2.add(null);
		System.out.println(set2);
		for (int v : set) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set1) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : set2) {
			System.out.print(v + " ");
		}

	}

}
