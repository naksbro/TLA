package practice;

public class tryMe {
	public static void main(String naks[]) {
		String a = "swaps";
		String b = "guaps";
		String c = "naks";
		
		a = b; // a = guaps, b = guaps, c = naks
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		
		b = c; //a = guaps, b = naks, c = naks
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		
		c = a; //a = guaps, b = naks, c =swaps
		System.out.println("a: "+a+" b: "+b+" c: "+c);
	}
}