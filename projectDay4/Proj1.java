package projectDay4;

public class Proj1 {
	public void printStatement() {
		System.out.println("Java is Fun!");
	}
	
	public void printStringParameter(String apple) {
		System.out.println(" \""+apple+"\"");
	}
	
	public double findAverage(int a, int b, int c, int d) {
		return (a + b + c + d)/4.0;
	}
	
	/*PALINDROME STRING
    Write a method which takes one String parameter with length=5 and returns boolean. 
    The method should check if the String parameter is palindrome (if it reads forward and backward in the same way)
    
    Example: 
    Input: madam
    Expected output: true
    
    Input: denim
    Expected output: false 
    */
	
	public boolean palindrome(String str) {
		if (str.length() != 5) {
			return false;
		}else if (str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3)) {
			return true;
		}else {
			return false;				
		}
	}
	
	public void printSentence(String snack, String meal, String drink) {
		System.out.println("I had "+snack+", "+meal+" and "+drink+" for my lunch today");
	}
	
	/* IS VOWEL
    Write a method that takes one char parameter check if the char is a vowel and return boolean. (Vowels: a, e, i, o, u.)
    Note: the method should not be case sensitive. 
    
    Example: 
    Input: a
    Expected Output: true
    
    Example: 
    Input: A
    Expected Output: true
    
    Input: c
    Expected Output: false
    
    */
	
	public boolean isVowel(char a) {
		if(a == 'a' || a == 'e' || a == 'i'|| a == 'o'|| a == 'u'|| a == 'A'|| a == 'E'|| a == 'I'|| a == 'O'|| a == 'U') {
			return true;
		} else {
		return false;
		}
	}
	
	public void isEligible(String name, int age) {
//		if(age >= 18) {
//			System.out.println(name+" is eligible to vote");
//		}else {
//			System.out.println(name+" is NOT eligible to vote");
//		}
		
//		String elig = age >= 18 ? name+" is eligible to vote" : name+" is NOT eligible to vote";
//		System.out.println(elig);
		System.out.println(age >= 18 ? name+" is eligible to vote" : name+" is NOT eligible to vote");
	}
}
