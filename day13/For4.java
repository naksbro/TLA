package day13;

public class For4 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
