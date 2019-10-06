package day5;
import java.util.Scanner;
public class BigString {
	public static void main(String args[]) {
		String bigStr;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		bigStr = sc.nextLine();
		
		System.out.println("Enter 2nd string: ");
		bigStr += sc.nextLine();
		
		System.out.println("Enter 3rd string: ");
		bigStr = bigStr + sc.nextLine();
		
		System.out.println(bigStr);
	}
}
