package com.core_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_Read_Write_Demo {

	public static void main(String[] args) throws Exception {
		File f1 = new File("c:/revaturejava/one.txt");
		File f2 = new File("c:/revaturejava/two.txt");
		
		FileInputStream fread = new FileInputStream(f1);
		FileOutputStream fwrite = new FileOutputStream(f2);
		
		int c = 0;
		
		while(!((c = fread.read()) == -1)){
			fwrite.write(c);
		}
		
		fwrite.close();
		fread.close();
		System.out.println("Data Copied");

	}

}
