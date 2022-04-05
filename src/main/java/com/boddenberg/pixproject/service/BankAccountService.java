package com.boddenberg.pixproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.boddenberg.pixproject.entity.BankAccount;
import com.boddenberg.pixproject.repository.BankAccountRepository;


import lombok.Data;

@Service
public class BankAccountService {

	@Autowired
	private BankAccountRepository repository;

	public ResponseEntity findAll() {
		List<BankAccount> lista = new ArrayList<>();

		lista = repository.findAll();

		if(lista.size() > 0){
			return new ResponseEntity(lista, HttpStatus.OK);
		}else{
			return new ResponseEntity("Erro ao processar banco de dados", HttpStatus.INTERNAL_SERVER_ERROR);
		}

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