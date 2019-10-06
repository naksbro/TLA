package assignments;

import java.util.Scanner;

public class Right2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word and we'll flip the last 2 letters to the front");
		String word = in.nextLine();
		int l = word.length() - 2;
		System.out.println(word.substring(l) + word.substring(0, l));
	}
}
