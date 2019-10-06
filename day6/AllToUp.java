package day6;
import java.util.Scanner;
public class AllToUp {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("What do you have to say? I will make it LOUDER!");
	String say = in.nextLine();
	
	System.out.println(say.toUpperCase());
	}
}
