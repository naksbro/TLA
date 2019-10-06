package day7;

import java.util.Scanner;

public class TwoNums {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Give us two numbers and we'll check if they're equal");
		System.out.println("First number");
		int num1 = in.nextInt();
		
		System.out.println("Second number");
		int num2 = in.nextInt();
		
		if(num1 == num2) {
			System.out.println(num1+" and "+ num2+" are equal");
		}
		else {
			System.out.println(num1+" and "+num2+" are not equal");
		}
	}
}
