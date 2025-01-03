package Lec45;

public class HashMap_Client {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
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
		System.out.println(map.get("Ankita"));

		System.out.println(map);
	}

}
