package day8;

public class TernaryOp {
	public static void main(String[] args) {
		int num1 = 61;
		int num2 = 8;
		
		int max;
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		System.out.println(max);
		
		int max2;
		//	if (num1 > num2)	T	F
		max2 = num1 > num2 ? num1 : num2;
		System.out.println(max2);
	}
}
