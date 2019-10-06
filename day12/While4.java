package day12;

public class While4 {
	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		int sum = 0;
		
		while(count <= num) {
			if(count%2==0) {
				
				sum = sum + count;
				
			}
			count++;
			
		}
		System.out.print("Sum of all even numbers from 0-100 is "+sum);
	}

}
