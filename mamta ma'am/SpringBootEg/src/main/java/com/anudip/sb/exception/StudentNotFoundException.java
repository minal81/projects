package com.anudip.sb.exception;

//custom exception
public class StudentNotFoundException extends  RuntimeException{

	private static final long serialVersionUID = 4284766184424637874L;

	public StudentNotFoundException(String message) {
		super(message);
		
	}
	
	

}
