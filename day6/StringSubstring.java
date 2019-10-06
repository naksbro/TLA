package day6;

public class StringSubstring {
	public static void main(String args[]) {
		String str = "SoftSkills";
		String str1 = str.substring(4);
		System.out.println(str1);
		
		str = "workspace";
		//System.out.println(str.substring(4));
		
		str = "HelloWorld";
		//System.out.println(str.substring(5));
		
		str = "SDLC";
		//System.out.println(str.substring(3));
		
		str = "Sublime";
		//System.out.println(str.substring(3));
		
		str = "Window";
		//System.out.println(str.substring(1));
		
		str = "OptimizePDF";
		//System.out.println(str.substring(8));
		
		str = "workspace";
		System.out.println(str.substring(0,4));
		
		str = "HelloWorld";
		System.out.println(str.substring(3,6));
		
		str = "SDLC";
		System.out.println(str.substring(1,3));
		
		str = "Sublime";
		System.out.println(str.substring(2,4));
		
		str = "Window";
		System.out.println(str.substring(1,4));
		
		str = "OptimizePDF";
		System.out.println(str.substring(4,8));
		
		str = "Navigate";
		System.out.println(str.substring(4,7));
		
		str = "Search";
		System.out.println(str.substring(1));
	}
}
