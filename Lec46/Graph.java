package Lec46;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
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

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum += map.get(vtx).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}

	public void removevertex(int v1) {
		for (int nbrs : map.get(v1).keySet()) {
			removeEdge(v1, nbrs);
		}
		map.remove(v1);

	}

	public void Display() {
		for (int vtx : map.keySet()) {
			System.out.println(vtx + " " + map.get(vtx));
		}
	}

	public boolean Hashpath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		// visited marked
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = Hashpath(nbrs, des, visited);
				if (ans) {
					return true;
				}
			}
		}
		return false;
	}

	public void PrintPath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		// visited marked
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintPath(nbrs, des, visited, ans + src);

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
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
			if (rv == des) {
				return true;
			}

			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);

				}
			}
		}
		return false;

	}
	public boolean DFS(int src, int des) {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		st.push(src);
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
			if (rv == des) {
				return true;
			}
			
			// 5. add unvisited nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
					
				}
			}
		}
		return false;
		
	}
}
