package Lec28;

public class Studnet {
	private String name = "kaju";
	private int roll = 16;
	private int age = 21;

	public Studnet() {
		// TODO Auto-generated constructor stub
		this("rajesh", 17, 18);
	}

	public Studnet(String name, int age, int roll_no) {
		this.name = name;
		this.age = age;
		this.roll = roll_no;

	}
//	public String getName() {
//		return this.name;
//	}
//	public void setName(String name) {
//		 this.name=name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) throws Exception {
		if (roll < 0) {
			throw new Exception("bklol roll number -ve nhi hoga");

		}
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	// 2nd ways
	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("bklol age  -ve nhi hoga");

			}
			this.age = age;
		}

		catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();

		} finally {
			System.out.println("I am in finally ");
		}

		System.out.println("Set_ age_me hu ");

	}
}
