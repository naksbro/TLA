package day8;

public class SwitchExample {
	public static void main(String[] args) {
		int babiesCount = 3;

		switch (babiesCount) {
		case 2:
			System.out.println("Great you got 2 babies");
			break;
		case 3:
			System.out.println("Great you got 3 babies");
			break;
		case 5:
			System.out.println("Great you got 5 babies");
			break;
		default:
			System.out.println("Hmm...you got " + babiesCount + " babies...");
		}
	}
}
