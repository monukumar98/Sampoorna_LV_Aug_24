package Lec15;

public class Check_Visited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[6];
		visited[3] = true;
		visited[1] = true;
		visited[4] = true;
		System.out.println(isvisted(visited, 2, 5));

	}

	// i to j me check koi kisi bhi index pe true fill hai ??
	public static boolean isvisted(boolean[] visited, int i, int j) {
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;

	}

}
