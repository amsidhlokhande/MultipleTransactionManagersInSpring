package com.amsidh.mvc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3023571019842024404L;
	@Id
	private Integer bookId;
	private String bookName;
	private String authorName;
	private Integer reservedStudentId;

	public Book() {

	}

	public Book(Integer bookId, String bookName, String authorName,
			Integer reservedStudentId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.reservedStudentId = reservedStudentId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getReservedStudentId() {
		return reservedStudentId;
	}

	public void setReservedStudentId(Integer reservedStudentId) {
		this.reservedStudentId = reservedStudentId;
	}

	@Override
	public String toString() {

		return bookId + "      " + bookName + "       " + authorName
				+ "       " + reservedStudentId;
	}
}
