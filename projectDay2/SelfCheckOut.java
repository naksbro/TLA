package projectDay2;
import java.util.Scanner;
public class SelfCheckOut {
 public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Welcome to self-checkout");
	 
	 System.out.println("Please enter your first item name:");
	 String item1Name = in.nextLine();
	 System.out.println("Please enter the price of "+item1Name);
	 int item1Price = in.nextInt();
	 
	 System.out.println("Please enter your next item name:");
	 String item2Name = in.next();
	 System.out.println("Please enter the price of "+item2Name);
	 int item2Price = in.nextInt();
	 
	 System.out.println("Please enter your next item name:");
	 String item3Name = in.next();
	 System.out.println("Please enter the price of "+item3Name);
	 int item3Price = in.nextInt();
	 
	 System.out.println("Please enter your next item name:");
	 String item4Name = in.next();
	 System.out.println("Please enter the price of "+item4Name);
	 int item4Price = in.nextInt();
	 
	 System.out.println("Please enter your final item name:");
	 String item5Name = in.next();
	 System.out.println("Please enter the price of "+item5Name);
	 int item5Price = in.nextInt();
	 
	 int subtotal = item1Price + item2Price + item3Price + item4Price + item5Price;
	 double tax = subtotal * .06;
	 double total = subtotal + tax;
	 
	 System.out.println("Thank you for shopping with us");
	 System.out.println("You have purchased the following items");
	 System.out.println("Item\tPrice");
	 System.out.println(item1Name+"\t"+item1Price);
	 System.out.println(item2Name+"\t"+item2Price);
	 System.out.println(item3Name+"\t"+item3Price);
	 System.out.println(item4Name+"\t"+item4Price);
	 System.out.println(item5Name+"\t"+item5Price);
	 System.out.println("Your total before tax is: $"+subtotal);
	 System.out.println("Your 6% tax amount is: $"+tax);
	 System.out.println("Your total after tax is: $"+total);
 }
}
