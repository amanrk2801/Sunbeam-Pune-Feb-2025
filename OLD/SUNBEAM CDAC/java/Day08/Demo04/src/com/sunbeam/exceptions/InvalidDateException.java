package com.sunbeam.exceptions;

// unchecked Exception
public class InvalidDateException extends RuntimeException{

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}
	
	
}
