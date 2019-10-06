package day8;

public class BooleanExpressions {
	public static void main(String[] args) {
		boolean b1 = true && false;
		System.out.println("b1 - " + b1);
		// true && false > always false

		boolean b2 = true || false;
		System.out.println("b2 - " + b2);
		// true || false > always true

		// (false || true) && false
		boolean b3 = (5 % 2 == 0 || true) && 5 > 6;
		System.out.println("b3 - " + b3);

		// (false) || (true && true)
		boolean b4 = (2 == 1) || (true && 4 >= 3);
		System.out.println("b4 - " + b4);
		// true && true
		boolean b5 = !false && true;
		System.out.println("b5 - " + b5);

		// true && false
		boolean b6 = (20 % 2 == 0) && !(5 / 2 <= 2);
		System.out.println("b6 - " + b6);
	}
}
