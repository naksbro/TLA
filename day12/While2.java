package day12;

public class While2 {
	public static void main(String[] args) {
		int num = 0;
		
//		while(num < 11) {
//		System.out.println(num+".)" +"\tHello\tWorld!");
//		num++;
//		}
		String a = "Academy";
		while(num < a.length()){
			num++;
			System.out.println(a.substring(0,num));
		}
		int b = a.length();
		int c = a.length()-1;
		while(c >= 0) {
			
			System.out.println(a.substring(a.length()-c)
					);
			c--;
		}
		
	}
	
}
