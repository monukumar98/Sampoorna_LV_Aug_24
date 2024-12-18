package Lec39;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		ab.GetPayment();
		Abstract_Demo_Child ab = new Abstract_Demo_Child();
		System.out.println(ab.GetPayment());
		System.out.println(ab.viewBAl());
		ab.Metro_Recharge();
		
		// java 8
		Abstract_Demo ab1 = new Abstract_Demo() {

			@Override
			public boolean GetPayment() {
				// TODO Auto-generated method stub
				return false;
			}};
			Abstract_Demo ab2 = new Abstract_Demo() {
				
				@Override
				public boolean GetPayment() {
					// TODO Auto-generated method stub
					return false;
				}};
	}

}
