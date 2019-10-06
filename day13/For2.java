package day13;

public class For2 {
	public static void main(String[] args) {
//		for(int i = 1; i <=5; i++) {
//			System.out.print(i+" ");
//		}
//		for(int i = 5; i >= 1; i--) {
//			System.out.println(i+" ");
//		}
		int sum = 0;
		
		for (int i = 0; i <= 8; i++) {
			if(i%2==0) {
				sum += i;
				System.out.print(i+" ");
			}
		}
		System.out.print("Sum = "+sum);
	}
}
