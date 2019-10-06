package day15;

public class BankAccount {
	private double balance;
	private String holderName;
	private boolean isTerminated;

	public BankAccount() {

	}

	public BankAccount(double bal, String holder, boolean isTerm) {
		if (bal >= 100) {
			this.balance = bal;
			this.holderName = holder;
			this.isTerminated = isTerm;
		} else {
			System.out.println("Sorry, minimun balance is $100.00");
		}

	}

	public BankAccount(double initBal, String initName) {
		this.balance = initBal;
		this.holderName = initName;
	}

	public String toString() {
		return holderName + " " + balance + " " + isTerminated;
	}

	public void deposit(double dep) {
		this.balance += dep;
	}

	public void withdraw(double with) {
		if (with > this.balance) {
			System.out.println(with + " Sorry, insufficient funds");
		} else {
			this.balance -= with;
		}
	}
}