package projectDay4;

public class Review {
	public static void main(String[] args) {
String name = "Tech Lead Academy";
        
        String firstLetter = name.substring(0,1);
        
        int indexOfFirstSpace = name.indexOf(" ");        
//      String secondLetter = name.substring(indexOfFirstSpace + 1, indexOfFirstSpace + 2);
        String secondLetter = name.substring(name.indexOf(" ") + 1,name.indexOf(" ") + 2 );
        
        
        String nameTwo = name.substring(indexOfFirstSpace + 1);
        
        String thirdLetter = nameTwo.substring(nameTwo.indexOf(" ") + 1,nameTwo.indexOf(" ") + 2 );
        
        name = firstLetter + secondLetter + thirdLetter;
        System.out.println(name);
//      //OUTPUT: TLA
		
	}
}
