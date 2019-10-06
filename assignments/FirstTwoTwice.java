package assignments;
import java.util.Scanner;
public class FirstTwoTwice {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's the word of the day?");
		String word = in.next();
		System.out.println(word.substring(0, 2)+word.substring(0, 2));
		
	}
}
