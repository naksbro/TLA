package day4;

import java.util.Scanner;

public class UserInput {
	public static void main(String naks[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How are you?");
		String answer = sc.nextLine();
		
		System.out.println(answer);
	}
}
