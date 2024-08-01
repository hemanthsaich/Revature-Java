package MethodOverloading;

public class Program1 {
	
	// add method accepts 2 parameters.
	int add(int x, int y) {
		return x+y;
	}
	//add method accepts 3 parameters
	int add(int x, int y, int z) {
		return x+y+z;
	}
	// add method accepts 4 parameters
	int add(int x, int y , int z, int m) {
		return x+y+z+m;
	}

	public static void main(String[] args) {
//		Creation of object reference
		Program1 p1 = new Program1();
		
		System.out.println(p1.add(10, 20));
		System.out.println(p1.add(10, 20, 30));
		System.out.println(p1.add(10, 20, 30, 40));
	}

}
