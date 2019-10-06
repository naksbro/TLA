package day4;

import java.util.Scanner;

public class Multiply {
	public static void main(String args[]) {
	Scanner num = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1 = num.nextInt();
	
	System.out.println("Enter second number");
	int num2 = num.nextInt();
	
	int result = num1 * num2;
	System.out.println(num1+ " times "+num2+" equals "+result);
	}
}
