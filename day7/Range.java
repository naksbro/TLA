package day7;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		/**
		 * if number within 1-10 not bad excluded
		 * if number within 10-50 good excluded
		 * if number within 50-100 perfect
		 * if number is 10 or 23 or 7 great
		 */
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		/**
		 * 	logical and is &&
		 * 	>= greater or equal
		 * 	<= less or equal
		 * 
		 * 	logical or is ||
		 */
		if(input > 1 && input < 10) {
			System.out.println("not bad");
		}
		
		if(input > 10 && input < 50) {
			System.out.println("good");
		}
		
		if(input > 50 && input < 100) {
			System.out.println("perfect");
		}
		
		if(input == 10 || input ==23 || input == 7 || input == 0) {
			System.out.println("great");
		}
		
		if(!(5 > 2)) {
			System.out.println("Yes 5 > 2");
		}
	}
}
