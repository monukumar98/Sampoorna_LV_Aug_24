package Lec43;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 87);
		map.put("Kaju", 78);
		map.put("Aman", 67);
		map.put("Ankita", 57);
		map.put("Ankit", 42);
		map.put("Puneet", 78);
		map.put("Ankit", 42);
		map.put("Kamlesh", 38);
		map.put("Mohan", 59);
		map.put("Ankita", 77);
		map.put("Amisha", 78);
		// map.put(null, 66);
		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Vansh"));
//		System.out.println(map.containsKey("Amisha"));
//		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Vansh"));
//		// reomve
//		System.out.println(map.remove("Vansh"));
//		System.out.println(map.remove("Ankit"));
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 87);
		map1.put("Kaju", 78);
		map1.put("Aman", 67);
		map1.put("Ankita", 57);
		map1.put("Ankit", 42);
		map1.put("Puneet", 78);
		map1.put("Ankit", 42);
		map1.put("Kamlesh", 38);
		map1.put("Mohan", 59);
		map1.put("Ankita", 77);
		map1.put("Amisha", 78);
		// map1.put(null, 66);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 87);
		map2.put("Kaju", 78);
		map2.put("Aman", 67);
		map2.put("Ankita", 57);
		map2.put("Ankit", 42);
		map2.put("Puneet", 78);
		map2.put("Ankit", 42);
		map2.put("Kamlesh", 38);
		map2.put("Mohan", 59);
		map2.put("Ankita", 77);
		map2.put("Amisha", 78);
		// map2.put(null, 66);
		System.out.println(map2);
//		System.out.println(map2.keySet());
//		Set<String> set = map.keySet();
//		for (String key : set) {
//			System.out.println(key + " " + map.get(key));
//		}
		for (String key :  map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

	}

}
