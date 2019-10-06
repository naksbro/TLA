package day13;

import java.util.Scanner;

public class BarCharRef {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Score 1:");
		System.out.println("Score 2:");
		System.out.println("Score 3:");
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int s3 = in.nextInt();

		showBar(s1);
		System.out.println("\n");
		showBar(s2);
		System.out.println("\n");
		showBar(s3);
		System.out.println("\n");
	}
	
	public static void showBar(int score) {
		for (int i = 0; i < score; i++) {
			System.out.print("#");
			if (i > 100) {
				break;
			}
		}
	}
}
