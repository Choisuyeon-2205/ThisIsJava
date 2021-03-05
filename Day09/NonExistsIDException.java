package com.kosta.day09;

public class NonExistsIDException extends Exception {
	
	public NonExistsIDException() {
		
	}
	
	public NonExistsIDException(String message) {
		super(message);
	}

}
