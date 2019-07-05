package com.java.gitrepodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleDemo {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(SampleDemo.class, args);
		System.out.println("hello raju this is my 1st program..."+context);
		System.out.println("hello raju ========>");
	}
}
