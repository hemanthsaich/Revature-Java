package Inheritance;

class Demo1{
	static void method1() {
		System.out.println("Inside parrent class");
	}
}

public class DemoApp extends Demo1 {

	public static void main(String[] args) {
		method1();
	}

}
