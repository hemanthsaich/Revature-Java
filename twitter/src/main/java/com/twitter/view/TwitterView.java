package com.twitter.view;

import java.util.Scanner;

import com.twitter.controller.TwitterController;
import com.twitter.controller.TwitterControllerInteraface;

public class TwitterView {

	public static void main(String[] args) {
		System.out.println("***Main Menu***");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to edit profile");
		System.out.println("Press 4 to delete profile");
		System.out.println("Press 5 to search profile");
		System.out.println("Press 6 to view all profile");
		System.out.println("Press 7 to login profile");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int c = sc.nextInt();
		
		TwitterControllerInteraface tc = new TwitterController();
		
		switch(c) {
		case 1: tc.createProfileController();
			break;
		case 2: tc.viewProfileController();
			break;
		case 3: tc.editProfileController();
			break;
		case 4: tc.deleteProfileController();
			break;
		case 5: tc.searchProfileController();
			break;
		case 6: tc.viewAllProfileController();
			break;
		case 7: tc.loginProfileController();
			break;
		default:System.out.println("Wrong choice");
		}
		
	}

}
