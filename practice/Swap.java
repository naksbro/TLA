package practice;

public class Swap {
	public static void main(String args[]) {
		String sky = "yellow";
		String sun = "blue";
		
		//TODO
		//swap the values between two int
		
		String tmpStr = sky;
		sky = sun;
		sun = tmpStr;
		
		System.out.println(sky);
		System.out.println(sun);
		
		//output:
		// blue
		// yellow
	}
}
