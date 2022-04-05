package com.boddenberg.pixproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boddenberg.pixproject.service.BankAccountService;

@RestController
@RequestMapping(path = "/pix")
public class BankAccountController {

		@Autowired
		BankAccountService service;
	
		@GetMapping("BankAccount/")
		public String allKeys() {
			return "Hello World";
			
		
		
		
		
		}
		
	}

	

