package com.amsidh.mvc.exception;

public class NoStudentFoundException extends RuntimeException{

	public NoStudentFoundException(String message) {
		System.out.println(message);
	}
}
