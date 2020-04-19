package com.amsidh.mvc.service;

import java.util.List;

import com.amsidh.mvc.exception.NoBookAssociationException;
import com.amsidh.mvc.exception.NoBookFoundException;
import com.amsidh.mvc.model.Book;

public interface BookService {
	public void addBook(Book book) throws NoBookAssociationException;

	public List<Book> getAllBook() throws NoBookFoundException;
}
