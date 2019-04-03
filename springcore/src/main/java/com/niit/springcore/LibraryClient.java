package com.niit.springcore;

import java.util.List;

//Injecting into Collection
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryClient {

	public static void main(String[] args) {
		
		ApplicationContext bf = new ClassPathXmlApplicationContext("book.xml");
		Library library = (Library)bf.getBean("library");
		
		//List of books
		List bookList = library.getBookList();
		
		//Lets print the properties of the book
		for(int i=0;i<bookList.size();i++)
		{
			System.out.println("*** Book"+(i+1)+" Properties***");
			Book book = (Book) bookList.get(i);
			System.out.println("Book Title        :"+book.getTitle());
			System.out.println("Book Author       :"+book.getAuthor());
			System.out.println("Book Publications :"+book.getPublications());
			System.out.println(" ");
		}
		
		//Lets print the primitives
		List stringList = library.getStringList();
		System.out.println("Primitives set to list :"+stringList);
	}

}