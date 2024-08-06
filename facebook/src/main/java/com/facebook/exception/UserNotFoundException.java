package com.facebook.exception;

public class UserNotFoundException extends Exception{
	 String message;
	 
	 public UserNotFoundException(String message) {
		 this.message = message;
	 }
	 
	 public String toString() {
		 return message;
	 }
}
