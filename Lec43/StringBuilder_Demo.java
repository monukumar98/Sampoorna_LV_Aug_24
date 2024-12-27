package Lec43;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();// capacity
		System.out.println(sb.capacity());
		sb.append('a');
		sb.append(871);
		sb.append("ytyftyfh1");
		sb.append(true);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());// 2*old_capacity+2
		System.out.println(sb.substring(2, 4));
		System.out.println(sb.charAt(0));
		System.out.println(sb.reverse());
		String s = sb.toString();// Stringbuilder to String
		StringBuilder sb1 = new StringBuilder(s);// String to Stringbuilder
		System.out.println(sb);
		System.out.println(sb.delete(0, 2));
		System.out.println(sb);

	}

}
