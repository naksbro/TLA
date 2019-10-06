package assignments;

import java.util.Scanner;

public class KevinSmith {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = in.nextLine();
		int l = name.length();
		String name1 = name.substring(0,name.indexOf(" "));
		String name2 = name.substring(name.indexOf(" ")+1);
		System.out.println(name.toLowerCase());
		System.out.println((name.toUpperCase()));
		System.out.println(name2+" "+name1);
	}

}
