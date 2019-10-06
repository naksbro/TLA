package projectDay3;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give us your 2 most recent grades we'll tell you your average");
		System.out.println("Grade 1?");
		int grade1 = in.nextInt();
		System.out.println("Grade 2?");
		int grade2 = in.nextInt();

		int average = (grade1 + grade2) / 2;
		
		// && not needed for all grades ex: >= 90] (invalid = average < 1 || average > 100)
		if (average >= 90 && average <= 100) {
			System.out.println("Grade: A");
		} else if (average >= 80 && average <= 89) {
			System.out.println("Grade: B");
		} else if (average >= 70 && average <= 79) {
			System.out.println("Grade: C");
		} else if (average >= 60 && average <= 69) {
			System.out.println("Grade: D");
		} else if (average <= 59 && average >= 0) {
			System.out.println("Grade: F");
		} else {
			System.out.println("invalid entry");
		}
		System.out.println("Your average is: "+average);
	}
}
