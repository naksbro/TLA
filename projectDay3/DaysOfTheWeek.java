package projectDay3;

import java.util.Scanner;

public class DaysOfTheWeek {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give us a number and we'll tell you what day of the week it is");
		int day = in.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}
