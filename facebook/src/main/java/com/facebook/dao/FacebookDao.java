package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public FacebookUser viewProfileDAO(FacebookUser fu) {
		
		// Need to declare it outside
		FacebookUser f2 = null;
		try {
//			Step 1: Load Driver
			Class.forName("com.mysql.jdbc.Driver");
			
//			Step 2: create Database Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturejava","root","123456");
			
//			Step 3: Create query
			PreparedStatement ps = con.prepareStatement("select * from facebookuser where email=?");
			ps.setString(1, fu.getEmail());
			
//			Step 4: Execute query
			ResultSet res = ps.executeQuery();
			
			
			if(res.next()) {
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				f2 = new FacebookUser();
				f2.setName(n);
				f2.setPassword(p);
				f2.setEmail(e);
				f2.setAddress(a);
				
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		return f2;
	}

	@Override
	public List<FacebookUser> viewAllProfileDAO() {
		
		List<FacebookUser> fl = new ArrayList<FacebookUser>();
		
		try {
			//Step 1: Load Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2: Create Database Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturejava","root","123456");
			
			//Step 3: Create Query
			PreparedStatement ps = con.prepareStatement("select * from facebookuser");
			
			//Step 4: Execute query
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
			    String a = res.getString(4);
			    
			    
			    FacebookUser fu = new FacebookUser();
			    fu.setName(n);
			    fu.setPassword(p);
			    fu.setEmail(e);
			    fu.setAddress(a);
			    
			    fl.add(fu);
			    
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return fl;
	}

	@Override
	public FacebookUser loginProfileDAO(FacebookUser fu) {
		FacebookUser f2=null;
	
			//Step 1: Load Driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2: Create Database Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturejava","root","123456");
				
				//Step 3: Create Query
				PreparedStatement ps = con.prepareStatement("select * from facebookuser where email=? and password=?");
				ps.setString(1, fu.getEmail());
				ps.setString(2, fu.getPassword());
				
				//Step 4: Execute query
				ResultSet res = ps.executeQuery();
				if(res.next()) {
					String n = res.getString(1);
					String p = res.getString(2);
					String e = res.getString(3);
				    String a = res.getString(4);
				    
				    
				    f2 = new FacebookUser();
				    f2.setName(n);
				    f2.setPassword(p);
				    f2.setEmail(e);
				    f2.setAddress(a);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		return f2;
	}

	@Override
	public int editProfileDAO(FacebookUser fu) {
		// TODO Auto-generated method stub
		return 0;
	}

}
