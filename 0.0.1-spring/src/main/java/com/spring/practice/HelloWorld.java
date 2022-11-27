package com.spring.practice;

//Step 1
public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Your message" + message);
	}

}
