package austin;

public class PracticeWhile {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		
		
			for (int b = 1; b <= 1000; b++) {
				if((b % 3==0) && (b % 5 == 0)) {
					a++;
					sum+=b;
					System.out.println("Found number " +b);
					}
					if(a==5) {
					break;
					}
				}
			System.out.println("Sum: "+sum);
	}
}
