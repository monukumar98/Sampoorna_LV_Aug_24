package Lec15;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "127";
		System.out.println(CountCBnumber(str));
	}

	public static int CountCBnumber(String s) {
		boolean[] visited = new boolean[s.length()];
		int c = 0;
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);// number me covert kro
				long num = Long.parseLong(str);
				if (IscbNumber(num) && isvisted(visited, i, j - 1)) {
					// marked
					for (int k = i; k <= j - 1; k++) {
						visited[k] = true;
					}
					c++;
				}
			}
		}
		return c;
	}

	public static boolean isvisted(boolean[] visited, int i, int j) {
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;

	}

	public static boolean IscbNumber(long num) {
		// 1st point
		if (num == 0 || num == 1) {
			return false;
		}
		// 2nd point
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		// 3rd point
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
