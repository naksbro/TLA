package day10;

public class Person {

	public String firstName;
	public String lastName;
	String fullName = firstName + " " + lastName;
	public int age;

	public void learn() {
		System.out.println(firstName + " " + lastName + " is learning.");
	}

	public void sleep() {
		System.out.println(firstName + " " + lastName + " is sleeping.");
	}

	public void eat() {
		System.out.println(firstName + " " + lastName + " is eating.");
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) {
		Person me = new Person();
		me.firstName = "Mark";
		me.lastName = "Admana";
		me.age = 30;

		me.learn();
		me.sleep();
		me.eat();

		me.getFullName();
		String fullName = me.getFullName();
		System.out.println(fullName);
	}
}
