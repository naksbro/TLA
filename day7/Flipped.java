package day7;

import java.util.Scanner;

public class Flipped {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word with an even amount of letters and I'll flip it in half");
		String word =in.nextLine();
		int l = word.length()/2;
		System.out.println(word.substring(l)+word.substring(0,l));
	}
}
