package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.facebook.entity.FacebookUser;

public class FacebookDao implements FacebookDaoInterface {
	int i = 0;

	@Override
	public int createProfileDAO(FacebookUser fu) {
		
		try {
			//Step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2: Create database connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturejava","root","123456");
			
//			Step 3: create query
			PreparedStatement ps = con.prepareStatement("insert into facebookuser values(?,?,?,?)");
			
			ps.setString(1, fu.getName());
			ps.setString(2, fu.getPassword());
			ps.setString(3, fu.getEmail());
			ps.setString(4, fu.getAddress());
			
			//Step 4: Execute query
			
			i = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
