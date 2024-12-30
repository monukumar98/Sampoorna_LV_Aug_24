package Lec44;

public class Is_set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int idx = 3;
		int mask = (1 << idx);
		if ((n & mask) == 0) {
			System.out.println("Unset bit ");
		} else {
			System.out.println("Set Bit");
		}

	}

}
