package day7;

import java.util.Scanner;

public class Range2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give us a number and we will tell you if it is in our range");
		int input = in.nextInt();
		
		if(input > 7 && input < 14) {
			System.out.println(input+" is within range");
		}
		else {
			System.out.println(input+" is out of range");
		}	
	}
}
