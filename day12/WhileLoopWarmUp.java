package day12;

public class WhileLoopWarmUp {
	public static void main(String[] args) {
		printNums(7,11);
	}
	
	public static void printNumbersInSeq(int num) {
		int index = 1;
		while(index <= num) {
			System.out.println(index+" ");
			index++;
		}
	}
	
	public static void printNums(int start, int end) {
		while(start <= end) {
			System.out.print(start+" ");
			start++;
		}
	}
}
