package projectDay2;
import java.util.Scanner;
public class RemainderEx {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any four digit number:");
		int fourDigits = in.nextInt();
		int digit1 = fourDigits/1000;
		int digit2 = fourDigits%1000/100;
		int digit3 = fourDigits%100/10;
		int digit4 = fourDigits%10;
		int sum = digit1 + digit2 + digit3 + digit4;
		System.out.println("The sum of the digits is: "+sum);
	}
}
