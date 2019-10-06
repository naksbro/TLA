package assignments;

import java.util.Scanner;

public class ExtraEnd {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a string and I will repeat the last two chars 3 times:");
		String input = in.nextLine();
		int l = input.length();
		String last2 = input.substring(l-2,l);
		System.out.println(last2+last2+last2);
	}
}
//done