package day9;

public class Car {
	public String model;
	public String color;
	public int year;
	public int speed;
	
	public void drive() {
		System.out.println("The "+color+" "+model+" is going "+speed+" miles per hour");
	}
	public int yearOfCar() {
		int modelYear = year;
		return modelYear;
	}
	public String colorModel() {
		String colmod = color+" "+model;
		return colmod;
	}
}
