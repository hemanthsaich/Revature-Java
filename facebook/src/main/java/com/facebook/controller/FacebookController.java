package com.facebook.controller;

import java.util.List;
import java.util.Scanner;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FaceBookControllerInterface {

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

		
		FacebookUser fu = new FacebookUser();
		fu.setName(name);;
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		FacebookServiceInterface fi = new FacebookService();
		int i = fi.createProfileService(fu);
		
		if(i > 0) {
			System.out.println("Profile Created");
		}else {
			System.out.println("Profile Rejected");
		}
	}

	@Override
	public void viewProfileController() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter email to view profile: ");
		String email = sc.next();
		
		FacebookUser fu = new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface  fs = new FacebookService();
		FacebookUser fl = fs.viewProfileService(fu);
		
		if(fl != null) {
			System.out.println("Your profile is: ");
			System.out.println("Name is --> "+fl.getName());
			System.out.println("Password is --> "+fl.getPassword());
			System.out.println("Email is --> "+fl.getEmail());
			System.out.println("Address is --> "+fl.getAddress());
			
			
		}else {
			System.out.println("Profile not existed for given mail id "+email);
		}

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllProfileController() {
		FacebookServiceInterface fs = new FacebookService();
		List<FacebookUser> fl1 =  fs.viewAllProfileService();
		
		for(FacebookUser vv:fl1) {
			System.out.println("**************");
			System.out.println("profile: ");
			System.out.println("Name --> "+vv.getName());
			System.out.println("Password --> "+vv.getPassword());
			System.out.println("Email  --> "+vv.getEmail());
			System.out.println("Address --> "+vv.getAddress());
		}

	}

	@Override
	public void LoginProfileController() {
		// TODO Auto-generated method stub

	}


}
