package com.amsidh.mvc.exception;

public class NoBookFoundException extends RuntimeException{

	public NoBookFoundException(String message) {
		System.out.println(message);
	}
}
