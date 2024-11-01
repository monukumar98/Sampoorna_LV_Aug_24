package Lec27;

public class Student {
	String name;
	int age;
	static String Mentor = "Monu Bhaiya";

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + age);

	}

	public void SayHey(String name) {
		System.out.println(this.name + " say Hey " + name + " " + age);
	}

	public static void MentorName(Student s) {
//		s.Intro_yourSelf();
//		Student s1 = new Student();
		System.out.println("Monu Bhaiya" + " " + s.name);
	}

	static {
		System.out.println("Welcome to Student Class");
	}
	static {
		System.out.println("Bye to Student Class");
	}
}
