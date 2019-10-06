package day11;

public class Warmup {
	public static void main(String[] args) {
		String first = "Rocio";
		String last = "Rodriguez";

		boolean firstNameR = first.contains("r") ? true : false;

		boolean lastNameR = last.contains("r") ? true : false;

		boolean firstLength5 = first.length() <= 5 ? true : false;

		boolean lastLength5 = last.length() <= 5 ? true : false;

		System.out.println(firstNameR);
		System.out.println(lastNameR);
		System.out.println(firstLength5);
		System.out.println(lastLength5);
		
		System.out.println("Name contains 'r': "+firstNameR);
		System.out.println("Name length is 5 or less: "+firstLength5);

	}
}
