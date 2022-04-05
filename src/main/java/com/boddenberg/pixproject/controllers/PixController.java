package com.boddenberg.pixproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pix")
public class PixController {

	@GetMapping("/")
	public String allKeys() {
		return "Hello World";
		
	
	
	
	
	}
	
}
