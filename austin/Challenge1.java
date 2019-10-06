package austin;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me what year you were born and I'll tell you how old you are turning or turned this year");
		int year = input.nextInt();
		int age = 2019 - year;
		System.out.println("You are going to be "+age+" this year!");
		
		System.out.println(birthYear(30));
				
	}
	
	public static int birthYear(int age) {
		int year = 2019 - age;
		return year;
	}
}
