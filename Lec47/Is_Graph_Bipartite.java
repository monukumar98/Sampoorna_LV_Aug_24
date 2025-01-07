package Lec47;

import java.util.*;

public class Is_Graph_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, Integer> visited = new HashMap<>();
			Queue<BipartitePair> q = new LinkedList<>();
			for (int i = 0; i < graph.length; i++) {// vtx
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rp = q.poll();// (vtx, dis)

					// 2. Ignore if Already visited
					if (visited.containsKey(rp.vtx)) {
						// odd
						if (visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;
					}

					// 3. add visited
					visited.put(rp.vtx, rp.dis);

					// 4. self work

					// add unvisited nbrs
					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}
				}

			}
			return true;

		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.dis = dis;
			this.vtx = vtx;
		}
	}
}
