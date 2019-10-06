package practice;

import java.util.Scanner;

public class Integers {
	public static void main(String args[]) {
		Scanner eggs = new Scanner(System.in);
		
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		System.out.println("How many baskets do you have?");
		numberOfBaskets = eggs.nextInt();
		
		System.out.println("How many eggs are in each basket?");
		eggsPerBasket = eggs.nextInt();
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		System.out.println("Then you should have a total of " +totalEggs+ " eggs.");
	}
}
