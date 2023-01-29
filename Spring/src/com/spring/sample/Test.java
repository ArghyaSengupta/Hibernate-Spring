package com.spring.sample;

import java.util.Scanner;

public class Test {
	   private String message;

	  // Scanner sc= new Scanner(System.in);
	   
	   //setter based injection
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	}
