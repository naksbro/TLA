package day11;

public class MethodRecaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(number(7));
		System.out.println(phrase("naksnamanbro"));
		
		
	}

	public static int number(int num1) {
		if (num1 >= 5 && num1 <= 8) {
			return num1 * 2;
		} else if (num1 >= 12 && num1 <= 20) {
			return num1 * 3;
		} else {
			return num1;
		}
	}

	public static String phrase(String a) {
		if (a.length() > 5 && a.length() < 10) {
			return a.substring(0, 3);
		}else if (a.length() > 10) {
			return a.substring(0, 5);
		}else {
			return a;
		}
	}
}