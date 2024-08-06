package com.core_java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
	public static void main(String[] args) throws IOException {
		File f2 = new File("c:/revaturejava/four.txt");
		FileOutputStream fwrite = new FileOutputStream(f2);
		
		Employee e1 = new Employee();
		e1.setName("Hemanth");
		e1.setPassword("ssddss");
		e1.setEmail("hemanth@mail.com");
		e1.setAddress("Andhra Pradesh");
		
		ObjectOutputStream out = new ObjectOutputStream(fwrite);
		
		out.writeObject(e1);
		fwrite.close();
		System.out.println("Object Written");
		
		
		
		}
	

}
