package day15;

public class BankAccDemo {
	public static void main(String[] args) {

		BankAccount ac1 = new BankAccount(120.0, "John", false);

		System.out.println("After deposit");
		ac1.deposit(300.00);
		System.out.println(ac1);

		ac1.deposit(20.0);
		System.out.println(ac1);

		System.out.println("After withdraw");
		ac1.withdraw(50.0);
		System.out.println(ac1);

		ac1.withdraw(400.00);
		System.out.println(ac1);
	}
}
