package com.facebook.dao;

import java.util.List;

import com.facebook.entity.FacebookUser;

public interface FacebookDaoInterface {

	int createProfileDAO(FacebookUser fu);

	FacebookUser viewProfileDAO(FacebookUser fu);

	List<FacebookUser> viewAllProfileDAO();

	FacebookUser loginProfileDAO(FacebookUser fu);

	int editProfileDAO(FacebookUser fu);

}
