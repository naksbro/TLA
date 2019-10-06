package assignments;

import java.util.Scanner;

public class IsEqual {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give 2 words and we'll tell you if they are the same");
		String w1 = in.next();
		System.out.println("Second word?");
		String w2 = in.next();
		boolean equal = w1.equals(w2);
		System.out.println(equal);
	}
}
