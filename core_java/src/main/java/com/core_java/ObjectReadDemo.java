package com.core_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f2 = new File("c:/revaturejava/four.txt");

		FileInputStream fread = new FileInputStream(f2);
		
		ObjectInputStream oread = new ObjectInputStream(fread);
		
		Employee ee = (Employee)oread.readObject();
		
		System.out.println("Name is: "+ee.getName());
		System.out.println("Password is: "+ee.getPassword());
		System.out.println("Email is: "+ee.getEmail());
		System.out.println("Address is: "+ee.getAddress());

	}

}
