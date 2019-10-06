package day6;

public class StringMethods {
	public static void main(String args[]) {
		String str = "hello World";
		int len = str.length();
		System.out.println(len);
		
		String str1 = "24(*%$";
		System.out.println(str1.length());
		
		System.out.println("abc".length());
		
		String st = new String("hello World");
		System.out.println(st.length());
		
		/* 
		 * toUpperCase(); --> converts to upper case
		 */
		
		str = "java";
		String str2 = str.toUpperCase();
		
		System.out.println(str+":"+str2);
		System.out.println(str.toUpperCase()+":"+str);
		
		/*
		 * indexOf(string) - to get index of certain string / if letter repeats will give first one
		 */
		str = "apple";
		int index = str.indexOf("p");
		System.out.println(index);
		
		/*
		 * charAt(index) char
		 */
		str = "home";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		/*
		 * .replace(oldString, newString);
		 */
		
		String word = "reopen";
		String wordMod = word.replace("e", "z");
		System.out.println(wordMod);
		
		/*
		 * .trim() 
		 */
	}
}
