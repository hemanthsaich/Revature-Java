package com.core_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Input {

	public static void main(String[] args) throws IOException {
		File f2 = new File("c:/revaturejava/three.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data: ");
		String inpData = br.readLine();
		FileOutputStream fwrite = new FileOutputStream(f2);
		
		for(int i=0;i<inpData.length();i++) {
			fwrite.write(inpData.charAt(i));
		}
		
		fwrite.close();
		System.out.println("Data Copied");
		
	}

}
