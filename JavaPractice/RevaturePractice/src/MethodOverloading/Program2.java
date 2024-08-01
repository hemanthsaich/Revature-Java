package MethodOverloading;

public class Program2 {
	
	//to find area of rectangle
	static int area(int length, int width) {
		return length*width;
	}
	
	//to find area of square
	static int area(int base) {
		return base*base;
	}
	
	//to find area of triangle
	static double area(double base, double height) {
		return 0.5 * base * height;
	}
	
	public static void main(String[] args) {
		System.out.println("Area of rectangle: "+area(5,10));
		System.out.println("Area of square: "+area(4));
		System.out.println("Area of triangle: "+area(5.0,9.0));


	}

}
