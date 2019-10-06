package practice;

import java.util.Scanner;

public class intInput {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many stories do you have each episode?");
		int storiesPerEp = keyboard.nextInt();
		
		System.out.println("How many episodes do you have every week?");
		int epsPerWeek = keyboard.nextInt();
		
		int storiesPerWeek;
		storiesPerWeek = storiesPerEp * epsPerWeek;
		System.out.println("Then, on average you should be doing " +storiesPerWeek+ " every week.");
	}
}
