package com.twitter.service;

import com.twitter.dao.TwitterDAOInterface;
import com.twitter.entity.TwitterUser;

public class TwitterService implements TwitterSericeInterface {

	@Override
	public int createProfileService(TwitterUser tu) {
		TwitterDAOInterface td = new TwitterDAO();	
		int i = td.createProfileDAO(tu);
		return i;
	}

}
