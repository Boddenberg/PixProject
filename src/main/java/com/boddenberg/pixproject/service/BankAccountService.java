package com.boddenberg.pixproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boddenberg.pixproject.entity.BankAccount;
import com.boddenberg.pixproject.repository.BankAccountRepository;


import lombok.Data;

@Service
public class BankAccountService {
	
	private final BankAccountRepository repository;
	
	public BankAccountService(BankAccountRepository repository) {
		this.repository= repository;
	}
		
	public List<BankAccount> findAll() {
		return repository.findAll();
	}
	
	public BankAccount add(BankAccount bankAccount) {
		return repository.save(bankAccount);
	}
	
	public BankAccount update(BankAccount bankAccount) {
		return repository.save(bankAccount);
	}
	
	public BankAccount delete(BankAccount bankAccount) {
		return repository.save(bankAccount);
	}	
}