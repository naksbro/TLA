package day6;
import java.util.Scanner;
public class StrCounter {
	public static void main(String args[]) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the word, I will count chars for you:");
		str = sc.nextLine();
		int count = str.length();
		
		System.out.println("Your word has "+count+" chars..");
	}
}
