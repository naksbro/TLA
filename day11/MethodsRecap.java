package day11;

public class MethodsRecap {

	public static void main(String[] args) {
//		void methods		
		sayHello();
		sayWord("word");
		printNum(69, 420);
		printNumTern(77, 69);

//		return methods must be stored in a var		
		String num = getNum(7, 3);
		System.out.println(num);
		
		int out = getMax(3,6,9);
		System.out.println(out);
		
		String twoLtr = getFirstTwo("naks bro");
		System.out.println(twoLtr);
		
		System.out.println(strThreeTimes("naks"));
	}
	

//	Void
	public static void sayHello() {
		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
	}

	public static void sayWord(String word) {
		System.out.println(word);
	}
	
	public static void printNum(int i, int j) {
		if (i > j) {
			System.out.println(i +" "+ j);
		} else {
			System.out.println(j +" "+ i);
		}		
	}
	
	public static void printNumTern(int num1, int num2) {
		String out = num1 > num2 ? num1+" "+num2 : num2+" "+num1;
		System.out.println(out);
	}

//	Return
	public static String getNum(int a, int b) {
		String big = a > b ? a+" "+b : b+" "+a;
		return big;
	}
	
	public static int getMax(int e, int f, int g) {
		int max;
		if(e > f && e > g) {
			max = e;
		} else if(f > e && f > g) {
			max = f;
		} else {
			max = g;
		}
		return max;
	}

	public static String getFirstTwo(String a) {
		String b = a.substring(0, 2);
		return b;
	}
	
	public static String strThreeTimes(String in) {
		String word = in+in+in;
		return word;
	}
}
