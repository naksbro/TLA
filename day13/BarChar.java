package day13;

import java.util.Scanner;

public class BarChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Score 1:");
		System.out.println("Score 2:");
		System.out.println("Score 3:");
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int s3 = in.nextInt();

		for (int i = 0; i < s1; i++) {
			System.out.print("#");
		}
		for (int i = 0; i < s2; i++) {
			System.out.print("#");
		}
		for (int i = 0; i < s3; i++) {
			System.out.print("#");
		}
	}
}
