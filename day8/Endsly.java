package day8;

import java.util.Scanner;

public class Endsly {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give us a word and I'll tell you if it ends in ly");
		String word = in.nextLine();
		
		// with substring = int len = word.length()
		//if(word.substring(len - 2).equals("ly"))

		if (word.endsWith("ly")) {
			System.out.println("EndsLy");
		} else {
			System.out.println("NonEndsLy");
		}
	}
}
