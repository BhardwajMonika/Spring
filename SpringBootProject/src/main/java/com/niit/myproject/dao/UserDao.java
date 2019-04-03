package com.niit.myproject.dao;

import java.util.List;
import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.niit.myproject.model.User;

@Repository
public class UserDao{
	
	@Autowired
	JdbcTemplate template;
	
	public List<User> getUsers(){    
	    return template.query("select * from user",new RowMapper<User>(){    
	        public User mapRow(ResultSet rs, int row) throws SQLException {    
	        	User u=new User();    
	            u.setId(rs.getInt(1));    
	            u.setName(rs.getString(2));    
	            u.setEmail(rs.getString(2));   
	            return u;    
	        }    
	    });   
}} 