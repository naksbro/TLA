package day12;

public class While5 {
	public static void main(String[] args) {
		int number = 10;
        int counter = 0;
        int sum = 0;
        
        while(counter <= number) {
            
            if(counter % 2 == 1) {
                //System.out.print(counter+" ");
                sum += counter;
            }
        
            counter++;
        }
        
        System.out.println("Sum of odd numbers from 0-"+number+" is "+sum);
}
}
