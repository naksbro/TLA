package projectDay6;

import java.util.Scanner;

public class TheSimplestMethod {
	public static void main(String[] args) {
		TheSimplestMethod o1 = new TheSimplestMethod();
		Scanner in = new Scanner(System.in);
		
//		o1.printTheString(7, "lucky");
		
//		o1.printEachCharacter("Hi Kuba");
		
//		o1.reverseTheString("Hi Kuba");
		
		o1.guessTheNumber();
	}

	public void printTheString(int n, String str) {
		for (int i = 1; i <= n; i++) 
			System.out.println(i + ". "+ str);
	}
	
	public void printEachCharacter(String a) {
		for(int i = 0; i < a.length(); i++)
			System.out.println(i+") "+a.charAt(i));
	}
	
	public void reverseTheString(String rts) {
		for (int i = rts.length()-1; i >= 0; i--)
			System.out.print(rts.charAt(i));
	}
	
	public void guessTheNumber() {
		Scanner in = new Scanner(System.in);
		String ans;
		do {
			System.out.println("Enter first number");
			int a = in.nextInt();
			System.out.println("Enter next number");
			int b = in.nextInt();
			System.out.println(a+"+"+b+"= "+(a+b));
			System.out.println("Do you want to play again? yes or no");
			ans = in.next();
		}while (ans.equalsIgnoreCase("yes")); 
		System.out.println("See you next time!");
	}
}
