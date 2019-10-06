package assignments;

import java.util.Scanner;

public class WithoutEnd {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word with at least 2 letters");
		String word = in.nextLine();
		System.out.println(word.substring(1, word.length()-1));
	}
}
