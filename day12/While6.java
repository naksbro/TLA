package day12;

import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give a number");
		int num = in.nextInt();
		System.out.println("\n");
		String a = "*";
		int index = 0;
		while(index < num){
			System.out.println(a);
			a += "*";
			index++;
		}
		int c = a.length();
		while(a.length()>=0) {
			c--;
			System.out.println(a.substring(0,c));
	}
}
}
