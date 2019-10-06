package day9;

public class DogDemo {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "Mumu";
		dog1.age = 3;
		dog1.color = "brown";
		//dog1.printDetails();
		dog1.bark();
		//System.out.println("My dog "+dog1.name+" is "+dog1.age+" years old in human years. In dog years thats "+dog1.age*7+". Their color is " +dog1.color+".");
		String dogDeets = dog1.getDetails();
		System.out.println(dogDeets);
		int pplYears = dog1.getHumanAge();
		System.out.println(pplYears+ " in human years");
		
		Dog dog2 = new Dog();
		dog2.name = "Naks";
		dog2.age = 7;
		dog2.color = "white";
		//dog2.printDetails();
		dog2.run();
		dogDeets = dog2.getDetails();
		System.out.println(dogDeets);
	}
}
