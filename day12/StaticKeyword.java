package day12;

public class StaticKeyword {
	public static void main(String[] args) {
		myStaticMethod();
		
		StaticKeyword obj = new StaticKeyword();
		obj.regularMethod();
	}
	
	public static void myStaticMethod() {
		System.out.println("from static method");
	}
	
	public void regularMethod() {
		System.out.println("from reg meth");
	}
}
