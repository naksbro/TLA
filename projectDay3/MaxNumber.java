package projectDay3;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give us 2 numbers and we'll tell you which one is greater");
		System.out.println("First number");
		int num1 = in.nextInt();
		System.out.println("Second number");
		int num2 = in.nextInt();
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max+" is greater");
		//num1 > num2 ? num1 : num2 > num3 ? num2 : num3 > num1 ? num1 : num3;
	}
}
