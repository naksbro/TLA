package austin;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give us your birthday and we'll tell you how old you are!");
		System.out.println("Example: if your birthday is March 21, 1989 enter 032189");
		
		String bday = input.next();
		String month = bday.substring(0,2);
		int m = Integer.parseInt(month);
		String day = bday.substring(2,4);
		int d = Integer.parseInt(day);
		String year = bday.substring(4);
		int y = Integer.parseInt(year);
		int age = 119-y;
		if (m > 9 && d > 16) {
			--age;
			System.out.println("You are "+age+" and still have birthday coming up this year!");
		}else {
			System.out.println("You are "+age+" and will be "+(++age)+" next year!");
		}
		
	}
}
