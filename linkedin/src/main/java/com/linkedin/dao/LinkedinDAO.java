package com.linkedin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.linkedin.entity.LinkedinUser;

public class LinkedinDAO implements LinkedinDAOInterface {
	
	int i = 0;

	@Override
	public int createProfileDAO(LinkedinUser lu) {
		
		try {
			// Step 1. Load Driver(Driver means class)
			Class.forName("com.mysql.jdbc.Driver"); // Checked Exception occurs so, we use try catch block to handle it.
			
			//Step 2: Create database connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturejava","root","123456");
			
			//Step 3: Create query
			PreparedStatement ps = con.prepareStatement("insert into linkedinuser values(?,?,?,?)"); // ? means placeholder of the value
			
		  
			// how to replace placeholder (?) with value ?
			ps.setString(1, lu.getName());
			ps.setString(2, lu.getPassword());
			ps.setString(3, lu.getEmail());
			ps.setString(4, lu.getAddress());
			
			//Step 4: Execute query
			// for insert, update, delete we will use executeUpdate() method	
			//execute method return type will be int, it will indicate no of rows affected by
			// for select query will use executeQuery() method
			//executeQuery()method return type will be Resultset	
			
			i = ps.executeUpdate();
		}
		catch(Exception e){
				e.printStackTrace();
		}
		return i;
	}

}
