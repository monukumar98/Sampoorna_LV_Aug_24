package Lec47;

import java.util.*;

public class Graph2 {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void BFT() {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			
			q.add(src);// 
			while (!q.isEmpty()) {
				// 1. remove
				int rv = q.poll();

				// 2. Ignore if Already visited
				if (visited.contains(rv)) {
					continue;
				}

				// 3. Marked visited
				visited.add(rv);

				// 4. Self work
				System.out.print(rv + " ");

				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);

					}
				}
			}
		}
		
		System.out.println();
	}
	public void DFT() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			
			st.push(src);// 
			while (!st.isEmpty()) {
				// 1. remove
				int rv = st.pop();
				
				// 2. Ignore if Already visited
				if (visited.contains(rv)) {
					continue;
				}
				
				// 3. Marked visited
				visited.add(rv);
				
				// 4. Self work
				System.out.print(rv + " ");
				
				// 5. add unvisited nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
						
					}
				}
			}
		}
		
		System.out.println();
	}
}
