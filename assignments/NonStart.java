package assignments;

import java.util.Scanner;

public class NonStart {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first word:");
		String word1 = in.nextLine();
		System.out.println("Enter second word:");
		String word2 = in.nextLine();
		System.out.println(word1.substring(1)+word2.substring(1));
	}
}
