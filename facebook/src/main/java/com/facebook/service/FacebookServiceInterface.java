package com.facebook.service;

import java.util.List;

import com.facebook.entity.FacebookUser;

public interface FacebookServiceInterface {


	int createProfileService(FacebookUser fu);

	FacebookUser viewProfileService(FacebookUser fu);

	List<FacebookUser> viewAllProfileService();



	FacebookUser loginProfileService(FacebookUser fu);

	int editProfileService(FacebookUser fu);
	
	

}
