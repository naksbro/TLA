package day13;

public class EachLetter {
	public static void main(String[] args) {
		//printLetter("Hello");
		//printLetterSpace("Hello");
		printReverse("Hello");
	}

	public static void printLetter(String str) {
		int c = 0;
		while (c < str.length()) {
			System.out.print(str.charAt(c) + "\n");
			c++;
		}
	}

	public static void printLetterSpace(String str) {
		int c = 0;
		while (c < str.length()) {
			System.out.print(str.charAt(c) + "\t");
			c++;
		}
	}
	
	public static void printReverse(String str) {
		int i = str.length()-1;
		while (i >= 0) {
			System.out.println("\t"+str.charAt(i)+"\n");
			i--;
		}
	}
	
}