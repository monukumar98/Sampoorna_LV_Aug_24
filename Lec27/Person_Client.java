package Lec27;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Person p = new Person();
		Person p1 = new Person("Raj", 25);
		p.name = "Kunal";
		p.age = 28;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p1.name);
		System.out.println(p1.age);

	}

}
