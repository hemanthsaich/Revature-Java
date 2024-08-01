package com.linkedin.controller;

import java.util.Scanner;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.service.LinkedinService;
import com.linkedin.service.LinkedinServiceInterface;

public class LinkedinController implements LinkedinControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter address: ");
		String address = sc.next();
		
		LinkedinUser lu = new LinkedinUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		LinkedinServiceInterface ls = new LinkedinService();
		int i = ls.createProfileService(lu);
		
		if(i>0) {
			System.out.println("Profile Created");
		}else {
			System.out.println("Profile rejected");
		}
		

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void followProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void unfollowProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void connectProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

}
