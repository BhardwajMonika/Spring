package com.niit.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.myproject.dao.UserDao;
import com.niit.myproject.model.User;

@RestController
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	UserDao dao;
	
	@RequestMapping("/insert")
	public String inputdata()
	{
		jdbc.execute("insert into user(name,email) values('Monika','monika@gmail.com')");
		return "Data inserted successfully";
	}
	
	@RequestMapping("/update")
	public String updatedata()
	{
		jdbc.execute("update user set name='Priya' where id=1");
		return "Data updated";
	}
	
	@RequestMapping("/delete")
	public String deletedata()
	{
		jdbc.execute("delete from user where id=1");
		return"Deleted Successfully";
	}
	
	@RequestMapping("/viewuser")
	public String viewUsers(Model m)
	{
	
		List<User> list=dao.getUsers();
		m.addAttribute("list",list);
		return "viewuser";
	}
}
