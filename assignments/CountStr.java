package assignments;

import java.util.Scanner;

public class CountStr {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word I will tell you how many letters it has");
		String word = in.nextLine();
		String noSpace = word.replace(" ", "");
		int l = noSpace.length();
		System.out.println(word + " has " + l + " letters");
	}
}
