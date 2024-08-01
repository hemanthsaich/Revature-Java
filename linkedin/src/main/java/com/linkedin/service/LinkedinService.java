package com.linkedin.service;

import com.linkedin.dao.LinkedinDAO;
import com.linkedin.dao.LinkedinDAOInterface;
import com.linkedin.entity.LinkedinUser;

public class LinkedinService implements LinkedinServiceInterface {

	@Override
	public int createProfileService(LinkedinUser lu)  {
		
		LinkedinDAOInterface ld = new LinkedinDAO();
		
		return ld.createProfileDAO(lu);
	}

}
