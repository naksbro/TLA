package assignments;

import java.util.Scanner;

public class CountLetters {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Say anything I will tell you how many letters it has");
		String str = in.nextLine();
		String noSpaceOrPunc = str.replace(" ","")+str.replace(".","")+str.replace(",","");
		int l = noSpaceOrPunc.length();
		System.out.println("That has "+l+" letters in it.");
	}
}
