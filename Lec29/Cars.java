package Lec29;

public class Cars {
	String color = "Red";
	int price = 9000000;
	int speed = 25;

	@Override
	public String toString() {
		return "C " + color + " P " + price + " S " + speed;
	}

	public static void main(String[] args) {
		Cars c = new Cars();
		System.out.println(c);

	}
}
