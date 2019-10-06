package assignments;

import java.util.Scanner;

public class MakeOutWord {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word you want to wrap");
		String word = in.nextLine();
		System.out.println("[["+word+"]]");
	}
}	
