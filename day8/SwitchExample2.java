package day8;

public class SwitchExample2 {
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("Your score was within 90-100");
			break;
		case 'B':
			System.out.println("Your score was within 80-90");
			break;
		case 'C':
			System.out.println("Your score was within 80-70");
			break;
		default:
			System.out.println("Next year!");
		}
		/**
		 * Data types that works for switch
		 * 
		 * int(Integer), byte(Byte), short(Short)
		 * char(Character)
		 * String
		 * enum values
		 */
		
		String season = "summer";
		switch(season) {
		case "winter":
		case "autumn":
			System.out.println("COLD");
			break;
		case "summer":
			System.out.println("HOT");
			break;
		case "spring":
			System.out.println("warm");
			break;
		}
	}
}
