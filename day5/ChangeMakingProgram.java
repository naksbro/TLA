package day5;
import java.util.Scanner;
public class ChangeMakingProgram {
	public static void main(String args[]) {
		/* requirement:
		 * write a program that accepts from a user number from 1 to 99
		 * the program responds by telling the user one combination of coins that equals that amount of change
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much change do you have?");
		int change = input.nextInt();
		
		int q = change/25; 
		int d = change%25/10;
		int n = change%25%10/5;
		int p = change%25%10%5/1;
		
		System.out.println("Then you should have:");
		System.out.println(q+" quarters");
		System.out.println(d+" dimes");
		System.out.println(n+" nickles");
		System.out.println(p+" pennies");
		System.out.println("That should be "+(q+d+n+p)+" coins all together");

	}
}
