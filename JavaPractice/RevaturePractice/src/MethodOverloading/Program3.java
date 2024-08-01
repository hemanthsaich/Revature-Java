package MethodOverloading;

public class Program3 {
	
	static int print(int i) {
		return i;
	}
	
	static double print(double d) {
		return d;
	}
	
	static String print(String s) {
		return s;
	}

	public static void main(String[] args) {
		System.out.println("Integer: "+print(10));
		System.out.println("Double: "+print(10.5));
		System.out.println("String: "+print("Method Overloaded Successfully"));

	}

}
