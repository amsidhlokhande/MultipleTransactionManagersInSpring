package com.amsidh.mvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amsidh.mvc.dao.BookDao;
import com.amsidh.mvc.exception.NoBookAssociationException;
import com.amsidh.mvc.exception.NoBookFoundException;
import com.amsidh.mvc.model.Book;
import com.amsidh.mvc.model.Student;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addBook(Book book) throws NoBookAssociationException {
		Session session = sessionFactory.openSession();
		session.beginTransaction();  
		if (session.get(Student.class, book.getReservedStudentId()) != null) {
			session.save(book);
		} else {
			session.save(book);
			//throw new NoBookAssociationException("Book is not associated");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() throws NoBookFoundException {
		Session session = sessionFactory.openSession();
		session.beginTransaction();  
		List<Book> listBook = (List<Book>) session.createQuery("from Book")
				.list();
		if (listBook.isEmpty()) {
			throw new NoBookFoundException("No book available");
		}
		return listBook;
	}

}
