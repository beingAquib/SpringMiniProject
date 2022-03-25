package com.example.demo.exceptions;

public class StudentNotFound extends RuntimeException {
	public StudentNotFound() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentNotFound(String msg) {
		 
		super(msg);
		
	}
	
}
