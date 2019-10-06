package day8;

import java.util.Random;

public class GreatNum {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(101);
		System.out.println(num);
		String str = num > 50 ? "Great number" : "Regular one";
		System.out.println(str);
	}
}
