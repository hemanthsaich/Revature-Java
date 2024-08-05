package com.facebook.controller;

import java.util.*;
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
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter email to delete  profile: ");
		String email = sc.next();
		
		FacebookUser fu = new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface  fs = new FacebookService();
		FacebookUser fl = fs.viewProfileService(fu);
		

	}

	@Override
	public void editProfileController() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter email to edit profile: ");
		String email = sc.next();
		
		FacebookUser fu = new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface  fs = new FacebookService();
		FacebookUser fl = fs.viewProfileService(fu);
		try {
		if(fl != null) {
			System.out.println("Your profile is: ");
			System.out.println("Name is --> "+fl.getName());
			System.out.println("Password is --> "+fl.getPassword());
			System.out.println("Email is --> "+fl.getEmail());
			System.out.println("Address is --> "+fl.getAddress());
			
			System.out.println("Press 1 to change password: ");
			System.out.println("Press 2 to change address: ");
			
			System.out.println("Enter choice: ");
			int c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("Enter new password: ");
				String npassword = sc.next();
				fl.setPassword(npassword);
				int i = fs.editProfileService(fl);
				
				if(i>0) {
					System.out.println("Password Changed");
				}
				break;
			
			case 2:
				System.out.println("Enter new address: ");
				String naddress = sc.next();
				fl.setAddress(naddress);
				i = fs.editProfileService(fl);
				
				if(i>0) {
					System.out.println("Password Changed");
				}
				break;
			default:
				System.out.println("Wrong Choice");


				
			}
			
		}else {
			System.out.println("Profile not existed for given mail id "+email);
		}}
		catch(Exception e) {
			System.out.println(e);
		}

		

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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email: ");
		String email= sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		FacebookUser fu = new FacebookUser();
		fu.setEmail(email);
		fu.setPassword(password);
		
		
		FacebookServiceInterface lf = new FacebookService();
		FacebookUser f1 = lf.loginProfileService(fu);
		
		if( f1 != null) {
			System.out.println("Your profile is: ");
			System.out.println("Name is --> "+f1.getName());
			System.out.println("Password is --> "+f1.getPassword());
			System.out.println("Email is --> "+f1.getEmail());
			System.out.println("Address is --> "+f1.getAddress());
			
			System.out.println("Login Sucessfull");
			
		}else {
			System.out.println("Credentials not matched");
		}
		
		

	}


}
