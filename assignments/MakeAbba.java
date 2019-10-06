package assignments;

import java.util.Scanner;

public class MakeAbba {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please give us one word:");
		String a = in.nextLine();
		System.out.println("Give us another word:");
		String b = in.nextLine();
		System.out.println(a+b+b+a);
	}
}
