package com.facebook.service;

import java.util.List;

import com.facebook.dao.FacebookDao;
import com.facebook.dao.FacebookDaoInterface;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser fu) {
		FacebookDaoInterface fd = new FacebookDao();
		return fd.createProfileDAO(fu);
	}

	@Override
	public FacebookUser viewProfileService(FacebookUser fu) {
		FacebookDaoInterface fd = new FacebookDao();
		
		return fd.viewProfileDAO(fu);
	}

	@Override
	public List<FacebookUser> viewAllProfileService() {
		FacebookDaoInterface fd = new FacebookDao();

		return fd.viewAllProfileDAO();
	}

	

}
