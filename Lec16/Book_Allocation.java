package Lec16;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] books = { 10, 20, 30, 40 };
		int nos = 2;
		System.out.println(Minimum_Page_Limit(books, nos));

	}

	public static int Minimum_Page_Limit(int[] books, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for (int v : books) {
			hi += v;
		}
		
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(books, nos, mid) == true) {
				ans = mid;
				hi = mid - 1;
				
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] books, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		for (int i = 0; i < books.length;) {
			if (readpage + books[i] <= mid) {
				readpage += books[i];
				i++;
			} else {
				student++;
				readpage = 0;
			}
			
			if (student > nos) {
				return false;
			}

		}
		
		return true;

	}

}
