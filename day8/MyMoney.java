package day8;

import java.util.Random;

public class MyMoney {
	public static void main(String[] args) {
		Random rndm = new Random();
		int bal = rndm.nextInt();

		if (bal > 0) {
			System.out.println("Your balanace is \"Positive\": $" + bal);
		} else if (bal < 0) {
			System.out.println("Your balance is \"Negative\": $" + bal);
		} else {
			System.out.println("Zero Balance");
		}
	}
}
