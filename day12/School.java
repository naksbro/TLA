package day12;

public class School {
	public String name;
	public String address;
	public static boolean isSummer;
	public static String currentDate;
	
	public void printDetails() {
		System.out.println("\tName: "+name);
		System.out.println("\tAddress: "+address);
		System.out.println("\tSummer: "+isSummer);
		System.out.println("\tDate: "+currentDate);
	}
}
