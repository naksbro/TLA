package day6;
import java.util.Scanner;
public class SecondPart {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println(str.substring(str.length()/2));		
	}
}
