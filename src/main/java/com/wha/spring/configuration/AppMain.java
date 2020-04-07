package com.wha.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	
	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("Production");
		context.scan("com.wha.spring");
		context.refresh();
		context.close();
		
		
		
	}
	

}
