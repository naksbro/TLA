package day4;

public class WholePrimatives {
	public static void main(String args[]) {
		
		//byte: -128 to 127
		byte num1 = 5;
		byte num2 = 6;
		byte sum = (byte)(num1 + num2); //casting | normal (int varName = byte1 + byte2;)
		//byte num3 = 129; too big byte =< 127
		
		//short: -32,768 to 32,767
		short num4 = 12345;
		short num5 = 543;
		int res = num4 + num5;
		System.out.println(num4 + num5);
		System.out.println("Short: "+res);
		
		//int: -2,147,483,648 to 2,147,483,647
		int num6 = 100;
		int num7 = 30;
		int sum1 = num6 * num7;
		System.out.println(sum1);
		
		
	}
}
