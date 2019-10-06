package day7;

public class CompareStrings {
	public static void main(String[] args) {
		String str = "java";
		String str1 = "java";
		
		System.out.println(str == str1); //	never use == with Strings
		System.out.println(str.equals(str1));	
		
		str = "java";
		str1 = new String("java");
		
		System.out.println(str == str1); //	never use == with Strings
		System.out.println(str.equals(str1));		
	}
}
