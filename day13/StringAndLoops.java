package day13;

public class StringAndLoops {
	public static void main(String[] args) {
		System.out.println(reverseStr("Hello"));
	}

	public static String reverseStr(String str) {
		int i = str.length() - 1;
		String out = "";
		
		while(i >= 0) {
			out += str.charAt(i)+"";
			//System.out.println(str.charAt(i));
			i--;
		}
		return out;
	}
}
