package day4;

import java.util.Scanner;

public class Divide {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		double num2 = sc.nextInt();
		
		double result = num1 / num2;
		System.out.println(num1+ " divided by "+num2+" equals "+result);
	}
}
