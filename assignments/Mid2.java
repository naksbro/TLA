package assignments;

import java.util.Scanner;

public class Mid2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a word with even number of letters an I'll show you whats in the middle");
		String word = in.nextLine();
		int l = word.length()/2;
		System.out.println(word.substring(l-1,l+1));
	}
}
