package day5;
import java.util.Scanner;
public class BigSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give a number");
		int num = sc.nextInt();
		
		System.out.println("Give next number");
		num += sc.nextInt();
		
		System.out.println("Give another number");
		num += sc.nextInt();
		
		System.out.println("And another");
		num += sc.nextInt();
		
		System.out.println("Give last number");
		num += sc.nextInt();
		
		System.out.println("All together that equals "+num);
	}
}
