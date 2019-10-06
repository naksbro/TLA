package day15;

public class SBMethods {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		System.out.println(sb);


		sb.insert(0, "123");
		System.out.println(sb);
		printAtEnd("ID", "234096710934875");
		printAtEnd("Naks","Bro");
		printAtEnd("apple","B");

		StringBuilder sb1 = new StringBuilder("abcdef");
		System.out.println(sb1);
		sb1.delete(1, 3);
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder("smartInstert");
		System.out.println(sb2);
		sb2.delete(3, 7);
		System.out.println(sb2);

		StringBuilder sb3 = new StringBuilder("abc");
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
	}

	public static void printAtEnd(String w, String s) {
		StringBuilder sb = new StringBuilder(w);
		sb.insert(w.length() - 1, s);
		System.out.println(sb);
	}

}
