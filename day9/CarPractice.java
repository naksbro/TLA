package day9;

public class CarPractice {
	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.model = "BMW i325";
		bmw.color = "red";
		bmw.speed = 55;
		bmw.drive();
		
		Car honda = new Car();
		honda.model = "Civic";
		honda.color = "Grey";
		honda.speed = 65;
		honda.year = 2003;
		honda.drive();
		int modelYear = honda.yearOfCar();
		String colorMod =honda.colorModel();
		System.out.println(modelYear+" "+colorMod);
	}
}
