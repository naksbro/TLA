package day8;

import java.util.Random;

public class EvenOddInt {
	public static void main(String[] args) {
		Random rndm = new Random();
		int num = rndm.nextInt(101);

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}
}
