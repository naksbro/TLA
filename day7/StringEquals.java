package day7;

public class StringEquals {
	public static void main(String args[]) {
		String str = "apple";
		System.out.println(str.equals("apple"));
		
		String str1 = "orange";
		String str2 = "Orange";
		
		System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
