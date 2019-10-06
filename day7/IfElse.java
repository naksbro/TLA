package day7;

public class IfElse {
	public static void main(String[] args) {
		
		if(2 > 1) {
			System.out.println("Hello World!");
		}
		
		boolean b = 5 < 2;
		if(b) {
			System.out.println();
		}
		
		boolean n = 10 > 100;
		if(n) {
			System.out.println("It was true and I'm here");
		}
		
		String w1 = "apple";
		String w2 = "applE";
		
		if(w1.equals(w2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
			System.out.println(w1+" : "+w2);
		}
	}
}
