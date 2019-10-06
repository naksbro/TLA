package day8;

import java.util.Scanner;

public class Access {
	public static final String password = "SAMSUNG";
	
	public static void main(String[] args) {
		String message;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your passowrd:");
		String input = sc.next();
		
		message = input.equals(password) ? "Welcome" : "Access Denied";
		
		System.out.println(message);
	}
}
