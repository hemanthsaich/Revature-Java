package com.core_java;

import java.io.File;

public class Directory_Demo {

	public static void main(String[] args) {
		File f = new File("c:/revaturejava");
		if(f.mkdir()) {
			System.out.println("Directory created");
		}
		else {
			System.out.println("Directory not created");
		}

	}

}
