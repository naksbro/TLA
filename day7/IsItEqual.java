package day7;

import java.util.Scanner;

public class IsItEqual {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two words and I will tell you if they are the same");
		System.out.println("Whats the first word?");
		String word = in.next();
		System.out.println("What's the second word?");
		String word1 = in.next();
		System.out.println("Are these words the same: "+word.equalsIgnoreCase(word1));
	}
}
