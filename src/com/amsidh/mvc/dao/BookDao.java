package com.amsidh.mvc.dao;

import java.util.List;

import com.amsidh.mvc.exception.NoBookAssociationException;
import com.amsidh.mvc.exception.NoBookFoundException;
import com.amsidh.mvc.model.Book;
import com.amsidh.mvc.model.Student;

public interface BookDao {

	public void addBook(Book book)throws NoBookAssociationException;
	public List<Book> getAllBook() throws NoBookFoundException;
}
