package day12;

public class SchoolDemo {
	public static void main(String[] args) {
		School tla = new School();
		tla.name= "techleadacademy";
		tla.address = "10090 main street";
		tla.isSummer = true;
		tla.currentDate = "09/26/19";
		tla.printDetails();
		
		School cd = new School();
		cd.printDetails();
	}
}
