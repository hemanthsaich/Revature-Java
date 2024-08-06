package com.core_java;

import java.io.File;

public class File_Demo {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/revaturejava/one.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}

	}

}
