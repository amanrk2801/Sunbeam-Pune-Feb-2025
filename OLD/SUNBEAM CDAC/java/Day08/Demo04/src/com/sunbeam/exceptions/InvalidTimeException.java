package com.sunbeam.exceptions;

// checked Exception
public class InvalidTimeException extends Exception{
	
	public InvalidTimeException() {
	}

	public InvalidTimeException(String message) {
		super(message);
	}
	
}
