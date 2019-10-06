package day8;

public class WithoutCurlyBraces {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		if (num2 > num1)
			System.out.println("line 9");
		else // only first statement is part of else when no {}
			System.out.println("line 11");
		System.out.println("line 12");

		if (num2 > num1) {
			System.out.println("line 18");
		} else {
			System.out.println("line 20");
			System.out.println("line 21");
		}
	}
}
