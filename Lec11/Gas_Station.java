package Lec11;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 }, cost = { 3, 4, 5, 1, 2 };
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0;
		for (int i = 0; i < cost.length; i++) {
			total += gas[i] - cost[i];
		}
		if (total < 0) {
			return -1;
		}
		int sum = 0, idx = 0;
		for (int i = 0; i < cost.length; i++) {
			sum += gas[i] - cost[i];
			if (sum < 0) {
				idx = i + 1;
				sum = 0;
			}
		}
		return idx;

	}
}
