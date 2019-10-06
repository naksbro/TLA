package day15;

public class CustomMethods {
	public static void main(String[] args) {
//		printNum(7);
		System.out.println(reverseWord("naks"));
		
		System.out.println(reverseLoop("bro"));
	}

	public static void printWord(String word) {
		System.out.println(word + "!");
	}

	public static void printNum(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Hello World");
		}
	}
	
	public static String reverseWord(String str) {
		StringBuilder sb = new StringBuilder(str);
		return new String (sb.reverse());
	}
	
	public static String reverseLoop(String str) {
		String rts = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rts += str.charAt(i);
		}
		return rts;
	}
	
}
