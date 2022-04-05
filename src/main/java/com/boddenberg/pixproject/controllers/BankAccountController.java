package com.boddenberg.pixproject.controllers;

import com.boddenberg.pixproject.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.boddenberg.pixproject.service.BankAccountService;

@RestController
@RequestMapping(path = "/pix")
public class BankAccountController {

		@Autowired
		BankAccountService service;
	
		@GetMapping("BankAccount")
		public ResponseEntity allKeys() {
			return service.findAll();
		}

		@PostMapping("salvar")
		public ResponseEntity salvarBankAccount(@RequestBody BankAccount bankAccount){
			return service.add(bankAccount);
		}
		
	}

	

