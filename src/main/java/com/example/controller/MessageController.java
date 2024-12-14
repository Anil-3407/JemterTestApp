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
		System.out.println("This is get message method");
		return "Welcome To IT";
	}
	
	@GetMapping("/greet")
    public String greetMsg() {
    	return "Good Evening Anil";
    }	
}
