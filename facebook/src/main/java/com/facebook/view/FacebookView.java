package com.facebook.view;
import java.util.*;

import com.facebook.controller.FaceBookControllerInterface;
import com.facebook.controller.FacebookController;


public class FacebookView {

	public static void main(String[] args) {
		
		String ss = "y";
		while(ss.equals("y")) {
			
			System.out.println("*****Main Menu*****");
			System.out.println("Press 1 to create profile");
			System.out.println("Press 2 to view profile");
			System.out.println("Press 3 to delete profile");
			System.out.println("Press 4 to edit profile");
			System.out.println("Press 5 to search profile");
			System.out.println("Press 6 to view all profiles");
			System.out.println("Press 7 to Login");
			
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			
			FaceBookControllerInterface fc = new FacebookController();

			
			
			switch(c) {
				
			case 1:	fc.createProfileController();
				break;
			case 2: fc.viewProfileController();
				break;
			case 3 : fc.deleteProfileController();
				break;
			case 4: fc.editProfileController();
				break;
			case 5: fc.searchProfileController();
				break;
			case 6: fc.viewAllProfileController();
				break;
			case 7: fc.LoginProfileController();
				break;
			default:
				System.out.println("Wrong choice");
			}
			
			System.out.println("If you want to continue press y : ");
			ss = sc.next();
			
		}
		
		
	}
	
		
		
}
