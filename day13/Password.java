package day13;

import java.util.Scanner;

public class Password {
	public static final String PASSWORD = "qwerty1$";
	
	public static void main(String[] args) {
		
		Password.access();
	}
	
	public static void access() {
		Scanner in = new Scanner(System.in);
		String pw = "";
		int t = 5;
		System.out.println("Enter your password");
		
		do {
			pw = in.next();
			if(!PASSWORD.equals(pw)) {
				
				System.out.println("Access Denied! ");
				System.out.println("You have "+t+" attempts remaining");
				t--;
			}
			
		}while(!PASSWORD.equals(pw));
		
		System.out.println("Welcome");
		if(t == 0) {
			System.out.println("Out of login attempts");
		}
	}
}
