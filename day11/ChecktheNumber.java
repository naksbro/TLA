package day11;

public class ChecktheNumber {
	public static void main(String[] args) {
		
		checkSumAndMax(55, 100);
	}
	
	public static void checkSumAndMax(int num1, int num2) {
		System.out.println("You have entered: "+num1+ " and "+num2);
		int sum = num1 + num2;
		System.out.println("The sum is: "+sum);
		int max = num1 > num2 ? num1 : num2;
		System.out.println("The max is: "+max);
	}
}
