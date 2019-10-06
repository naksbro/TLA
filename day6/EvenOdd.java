package day6;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string, if its even program will print 0 otherwise 1");
		String input = sc.nextLine();
		System.out.println(input.length()%2);
	}
}
