package com.linkedin.view;

import java.util.*;

import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;
public class LinkedinView {

	public static void main(String[] args) {
		System.out.println("****Main Menu****");
		
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to edit profile");
		System.out.println("Press 3 to delete profile");
		System.out.println("Press 4 to follow profile");
		System.out.println("Press 5 to unfollow profile");
		System.out.println("Press 6 to connect profile");
		System.out.println("Press 7 to login account");
		
		Scanner sc = new Scanner(System.in);
		
		int task = sc.nextInt();
		
		LinkedinControllerInterface lc = new LinkedinController();
		
		
		switch(task) {
		case 1: lc.createProfileController();
			break;
		case 2: lc.editProfileController();
			break;
		case 3: lc.deleteProfileController();
			break;
		case 4: lc.followProfileController();
			break;
		case 5: lc.unfollowProfileController();
			break;
		case 6: lc.connectProfileController();
			break;
		case 7: lc.loginProfileController();
			break;
		default:
			System.out.println("You have entered wrong choice");
		}
		
		sc.close();



	}

}
