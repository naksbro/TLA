package day4;

import java.util.Scanner;

public class SimpleSiri {
	public static void main(String naks[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Hi there, what's your name?");
	String answer = sc.nextLine();
	System.out.println("Nice to meet you "+answer+"!");
	
	System.out.println("What are you studying now?");
	answer = sc.nextLine();	//already declared
	System.out.println("Oh, "+answer+" is a great subject to study!");
	
	System.out.println("What's your favorite movie?");
	answer = sc.nextLine();	//already declared
	System.out.println("I heard about it. "+answer+" is a great movie..");
	} 
}
