package projectDay4;

public class Proj1Practice {
	public static void main(String[] args) {
		Proj1 p1 = new Proj1();
		p1.printStatement();
		
		p1.printStringParameter("hello");
		
		System.out.println(p1.findAverage(33,66,99,13));
		
		System.out.println(p1.palindrome("denim"));
		
		p1.printSentence("chips", "a burger", "a sprite");
	}
}
