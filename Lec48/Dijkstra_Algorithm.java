package Lec48;

import java.util.*;

public class Dijkstra_Algorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
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

	class DijkstraPair {
		int vtx;
		String acq_path;
		int cost;

		public DijkstraPair(int vtx, String acq_path, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acq_path = acq_path;
		}

		@Override
		public String toString() {
			return vtx + " " + acq_path + " @ " + cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();

			// 2. Ignore if Already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3.Marked Visited
			visited.add(rp.vtx);

			// 4. Self Work
			System.out.println(rp);

			// Add Unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acq_path + nbrs, rp.cost + cost));
				}
			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 3);
		dj.AddEdge(1, 4, 12);
		dj.AddEdge(2, 3, 4);
		dj.AddEdge(4, 3, 1);
		dj.AddEdge(4, 5, 5);
		dj.AddEdge(6, 5, 12);
		dj.AddEdge(7, 5, 7);
		dj.AddEdge(7, 6, 1);
		dj.Dijkstra(1);
	}
}
