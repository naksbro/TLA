package day7;

import java.util.Scanner;

public class TwoStr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 words:");
		String word1 = in.next();
		String word2 = in.next();
		
		if(word1.equalsIgnoreCase(word2)) {
			System.out.println(word1+" and "+word2+" are equal");
		}
		else {
			System.out.println(word1+" and "+word2+" are not equal");
		}
	}
}
