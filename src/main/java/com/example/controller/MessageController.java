package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MessageController {

	
	@GetMapping("/welcome")
	public String getMssg() {
		log.info("getMsg ()->executed!!!!!!!");
<<<<<<< HEAD
		int b=0;
=======
		System.out.println("This is get message method");
>>>>>>> cb522f01f36e93c3cc7b0f658d0b71e302deb7de
		return "Welcome To IT";
		
	}
	
	@GetMapping("/greet")
    public String greetMsg() {
    	return "Good Evening Anil";
    }	
}
