package utils;

import java.util.Scanner;

public class JavaUtils {

	public static String getInputFromConsole(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		String input = scanner.next();
		scanner.close();
		return input;
	}
	
	
}
