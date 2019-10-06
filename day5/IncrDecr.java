package day5;

public class IncrDecr {
	public static void main(String args[]) {
		int i = 1;
		i++; //adds increments of 1
		//System.out.println(i);
		
		i = i++ + i++ + 3; //post incr the next time var is used in same statement add 1 to var value
		//System.out.println(i);
		
		int i1 = 2;
		i1 = ++i1 + 1; //pre incr value shown in this statement 
		//System.out.println(i1);	
		// 2     2   + 3 - 2 +  3
		// i1 = i1++ + 3 - 2 + i1++
		
		int counter = 0;
		System.out.println(counter++);
		System.out.println(++counter);
		counter++;
		System.out.println(counter);
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is "+x);
		System.out.println("y is " +y);
		
		int x1 = 1;
		int y1 = x1 * x1-- + ++x1;
		System.out.println("x1 is "+x1);
		System.out.println("y1 is "+y1);
		
		int x2 = 5;
		x2 = x2 / 2 + ++x2;
		System.out.println(x2);
		
				
	}
}
