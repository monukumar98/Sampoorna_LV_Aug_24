package Lec17;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		int flipa = maximum_length(s, k, 'a');
		int flipb = maximum_length(s, k, 'b');
		System.out.println(Math.max(flipa, flipb));
	}

	public static int maximum_length(String s, int k, char ch) {
		// TODO Auto-generated method stub
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			//shrink
			while(flip>k && si<=ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans calculate
			ans =Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
