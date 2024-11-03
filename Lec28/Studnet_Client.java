package Lec28;

public class Studnet_Client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Studnet s = new Studnet("Raj", 24, 618);
		System.out.println("Hey");
		// s.setRoll(-19);
		System.out.println(s.getRoll());
		s.setAge(-9);
		System.out.println(s.getAge());
		System.out.println("Bye");

	}

}
