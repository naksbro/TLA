package day13;

import java.util.Scanner;

public class DW1 {
	public static void main(String[] args) {
//		int i = 0;
//		do {
//			System.out.print(i+" ");
//			i++;
//		}while(i <=5 );
		Scanner in = new Scanner(System.in);
		System.out.println("Provide a number");
		int n = in.nextInt();
		DW1.dwLoop(n);
		
	}
	
	public static void dwLoop(int n) {
	int i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while (i <= n);
	}
	
}
