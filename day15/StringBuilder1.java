package day15;

public class StringBuilder1 {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java Is Awesome");
		System.out.println(sb1);

		sb1.append(", Python is good");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb2.append("*");
		}
		
		System.out.println(sb2);
		
		printAsteriks(7);
		
		
	}
	
	public static void printAsteriks(int c) {
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < c; i++) {
			sb3.append("*");
		}
		System.out.println(sb3);
	}
}
