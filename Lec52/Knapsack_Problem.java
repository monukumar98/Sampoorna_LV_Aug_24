package Lec52;

public class Knapsack_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 12;
		int[] val = { 20, 5, 10, 40, 15, 25 };
		int[] wt = { 1, 2, 3, 8, 7, 4 };
		System.out.println(Knapsack(wt, val, cap, 0));
		

	}

	public static int Knapsack(int[] wt, int[] val, int cap, int idx) {
		if (cap == 0 || idx == wt.length) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + Knapsack(wt, val, cap - wt[idx], idx + 1);
		}
		exc = Knapsack(wt, val, cap, idx + 1);
		return Math.max(inc, exc);

	}

}
