package Lec27;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		s.name = "kaju";
		s.age = 18;
		s.Intro_yourSelf();
		Student s1 = new Student();// name age --> null and 0
		s1.name = "Raj";
		s1.age = 24;
		s1.Intro_yourSelf();
		s1.SayHey("Raju");
		s.Intro_yourSelf();
		s1.MentorName(s);
		Student.MentorName(s1);

	}

	static {
		System.out.println("Welcome to Student client Class");
	}

}
