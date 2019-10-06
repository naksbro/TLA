package day5;

public class SpecOps {	//specialized operators += -+ *= /=
	public static void main(String args[]) {
		int num1 = 6;
		//num1 = num1 + 5;
		num1 += 5; //same as num1 + 5
		System.out.println(num1);
		System.out.println("_____addition_____");
		
		int num2 = 100;
		//num2 = num2 - 45;
		num2 -= 45;
		System.out.println(num2);
		System.out.println("_____subtraction_____");
		
		int num3 = 5;
		//num3 = num3 *3;
		num3 *= 3;
		System.out.println(num3);
		System.out.println("_____multiplication_____");
		
		int num4 = 35;
		num4 /= 5;
		System.out.println(num4);
		System.out.println("_____division_____");
		
		double num5 = 10;
		num5 /= 3;
		System.out.println(num5);
		
	}
}
