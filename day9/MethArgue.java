package day9;

public class MethArgue {
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public String withOutFirst(String str) {
		String str1 = str.substring(1);
		return str1;
	}
	
	public static void main(String[] args) {
		MethArgue obj1 = new MethArgue();
		int num1 = 5;
		int num2 = 6;
		int mySum = obj1.sum(num1,num2);
		
		System.out.println(mySum);
		
		String word = obj1.withOutFirst("apple");
		System.out.println(word);
	}
}
