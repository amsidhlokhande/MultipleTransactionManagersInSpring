package com.amsidh.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amsidh.mvc.dao.BookDao;
import com.amsidh.mvc.exception.NoBookAssociationException;
import com.amsidh.mvc.exception.NoBookFoundException;
import com.amsidh.mvc.model.Book;
import com.amsidh.mvc.service.BookService;
@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	@Override
	public void addBook(Book book) throws NoBookAssociationException {
		bookDao.addBook(book);

	}

	@Transactional
	@Override
	public List<Book> getAllBook() throws NoBookFoundException {
		return bookDao.getAllBook();
	}

}
