package day11;

public class CheckContainsandLength {

	public static void main(String[] args) {
	
		checkTheString("Rocio");

	}
	public static void checkTheString(String name) {
		
		boolean nameR = name.contains("r") ? true : false;
		System.out.println(nameR);
		
		boolean nameL = name.length() <= 5 ? true : false;
		System.out.println(nameL);
	}
}
