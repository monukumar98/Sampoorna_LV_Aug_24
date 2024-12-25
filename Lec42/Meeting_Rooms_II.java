package Lec42;

import java.util.*;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 7, 9 }, { 0, 10 }, { 4, 5 }, { 8, 9 }, { 4, 6 }, { 5, 7 } };
//		for (int i = 0; i < intervals.length; i++) {
//			for (int j = 0; j < intervals[0].length; j++) {
//				System.out.print(intervals[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		minrooms(intervals);
//		for (int i = 0; i < intervals.length; i++) {
//			for (int j = 0; j < intervals[0].length; j++) {
//				System.out.print(intervals[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(minrooms(intervals));
	}

	public static int minrooms(int[][] intervals) {
		Arrays.sort(intervals, (p, q) -> p[0] - q[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<>((p, q) -> p[1] - q[1]);
		int room = 1;
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] >= pq.peek()[1]) {
				pq.poll();
				pq.add(intervals[i]);

			} else {
				pq.add(intervals[i]);
				room++;
			}
		}
		return room;

	}
}
