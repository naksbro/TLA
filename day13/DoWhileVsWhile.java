package day13;

public class DoWhileVsWhile {
	public static void main(String[] args) {
		int i, j;
		i = 5;
		j = 7;
		
		while (i > j) {
			System.out.println("Hello");
		}
		
		System.out.println("After loop while");
		
		do {
			System.out.println("Do while hello");
		}while (i > j); 
			System.out.println("After do while");

	}
	

}
