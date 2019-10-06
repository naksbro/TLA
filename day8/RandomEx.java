package day8;

import java.util.Random; //java.util.* - > to import all utils

public class RandomEx {
	public static void main(String[] args) {
		Random rndm = new Random();
		int num = rndm.nextInt(2000);

		if (num < 100) {
			System.out.println("inside 0 - 100");
		} 
		if (num >= 101 && num <= 200) {
			System.out.println("inside 101 - 200");
		} 
		if (num >= 201 && num <= 400) {
			System.out.println("inside 201 - 400");
		} 
		if (num >= 401 && num <= 1000) {
			System.out.println("inside 401 - 1000");
		} 
		if (num > 1000) {
			System.out.println("inside 2000");
		}
		System.out.println(num);
	}
}
