package com.niit.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotations {

	public static void main(String s[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println("Name   :"+student.getName());
		System.out.println("Age   :"+student.getAge());
		
	}
}
      