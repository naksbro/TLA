package projectDay3;

import java.util.Scanner;

public class Max3Nums {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Give us 3 numbers and we'll tell you which one is greater");
		System.out.println("First number");
		int num1 = in.nextInt();

		System.out.println("Second number");
		int num2 = in.nextInt();

		System.out.println("Third number");

		int num3 = in.nextInt();

		int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println(max + " is greater");

	}
}
