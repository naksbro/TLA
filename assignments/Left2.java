package assignments;

import java.util.Scanner;

public class Left2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word and we'll flip the first 2 letters to the end");
		String word = in.nextLine();
		System.out.println(word.substring(2)+word.substring(0,2));
	}
}
