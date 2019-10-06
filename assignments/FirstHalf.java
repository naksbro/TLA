package assignments;

import java.util.Scanner;

public class FirstHalf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word with an even amount of letters");
		String str = sc.nextLine();
		System.out.println(str.substring(0,str.length()/2));
	}
}
