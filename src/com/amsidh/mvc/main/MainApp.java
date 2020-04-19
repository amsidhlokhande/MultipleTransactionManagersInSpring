package com.amsidh.mvc.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.exception.NoBookAssociationException;
import com.amsidh.mvc.model.Book;
import com.amsidh.mvc.model.Student;
import com.amsidh.mvc.service.BookService;
import com.amsidh.mvc.service.StudentService;
import com.amsidh.mvc.service.impl.BookServiceImpl;
import com.amsidh.mvc.service.impl.StudentServiceImpl;

public class MainApp {

	public static void main(String[] args) throws NoBookAssociationException {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Book book=new Book(123, "Java Spring", "Amsidh", 548);
		Student student =new Student(456, "A B Lokhande", "BE", new Date(), new Long(8108551845L));
		
		BookService bookService=context.getBean(BookServiceImpl.class);
		StudentService studentService=context.getBean(StudentServiceImpl.class);
		
		studentService.addStudent(student);
		
		bookService.addBook(book);
		
		
		

	}

}
