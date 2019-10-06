package assignments;

import java.util.Scanner;

public class MakeTag {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("How do you want to tag your string?");
		String tag = in.nextLine();
		System.out.println("What string do you want to tag?");
		String word = in.nextLine();
		System.out.println("<"+tag+">"+word+"</"+tag+">");
	}
}
