package Lec52;

public class Edit_DIstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "horse";
		String t = "ros";
		System.out.println(Mini_Ops(s, t, 0, 0));

	}

	public static int Mini_Ops(String s, String t, int i, int j) {
		if(i==s.length()) {
			return t.length()-j;
		}
		if(j==t.length()) {
			return s.length()-i;
		}
		int ans=0;
		if(s.charAt(i)==t.charAt(j)) {
			ans= Mini_Ops(s, t, i+1, j+1);
		}
		else {
			int d =Mini_Ops(s, t, i+1, j);
			int a=Mini_Ops(s, t, i, j+1);
			int r =Mini_Ops(s, t, i+1, j+1);
			ans =1+Math.min(d, Math.min(r, a));
		}
		return ans;

	}

}
