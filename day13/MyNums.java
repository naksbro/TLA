package day13;

import java.util.Scanner;

public class MyNums {
	public static final int FAVORITENUMBER = 7;
	public static final int lessNumber = 5;

	public static void main(String[] args) {
	//	MyNums.favNums();
		MyNums.lessNum();
	}

	public static void favNums() {
		int numFromU = 0;
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Guess my favorite number");
		do {
			numFromU = in.nextInt();
			if (numFromU == FAVORITENUMBER) {
				System.out.println("Yes thats right my favorite number its " + numFromU);
			} else {
				System.out.println("Try again");
			}
		} while (flag);
	}
	
	public static void lessNum() {
		int a = 0;
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Guess my number if its less thn or equal you win");
		do {
			a = in.nextInt();
			if (a == lessNumber) {
				System.out.println("Thats it the right number is "+a+"!");
			}else if (a <= lessNumber) {
				System.out.println("Close enough you win");
			}else {
				System.out.println("Guess again!");
			}
		} while (flag);
	}
}
