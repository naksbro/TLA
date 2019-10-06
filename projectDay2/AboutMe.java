package projectDay2;
import java.util.Scanner;
public class AboutMe {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = in.next();
		
		System.out.println("What is your age?");
		String age = in.next();
		
		System.out.println("How many people are there in your family?");
		String family = in.next();
		
		System.out.println("Where do you live?");
		String live = in.next();
		
		System.out.println("How is the weather like where you live?");
		String weather = in.next();
		
		System.out.println("What is your hobby?");
		String hobby = in.next();
		
		System.out.println("What is your favorite subject at school?");
		String schlSub = in.next();
		
		System.out.println("My name is "+name+" and I am "+age+" years old. There are "+family+" people in my family.\n"
				+"I live in "+live+". It is "+weather+" in "+live+". I like "+hobby+". At school i like "+schlSub+".");
	}
}
