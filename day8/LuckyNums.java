package day8;

import java.util.Random;

public class LuckyNums {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(11);
		System.out.println(num);

		if (num == 1 || num == 7 || num == 9) {
			System.out.println("JACKPOT!");
		} else {
			System.out.println("Please try again!");
		}
	}
}
