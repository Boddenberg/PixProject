package com.boddenberg.pixproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boddenberg.pixproject.entity.BankAccount;
import com.boddenberg.pixproject.repository.BankAccountRepository;

@Service
public class BankAccountService {

	@Autowired
	private BankAccountRepository repository;

	/*
	 * 
	 */
	
	// A classe Controller é responsável por receber dados e devolver dados com Status
	// A Service trata os dados / controla regras de negócio 

	public ResponseEntity findAll() {
		List<BankAccount> lista = new ArrayList<>();

		lista = repository.findAll();

		if (lista.size() > 0) {
			return new ResponseEntity(lista, HttpStatus.OK);
		} else {
			return new ResponseEntity("Erro ao processar banco de dados", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	public ResponseEntity salvar(BankAccount bankAccountSalvar) {
		var teste = repository.save(bankAccountSalvar);
		System.out.println(teste);
		return new ResponseEntity(teste, HttpStatus.OK);
	}
	
	
	

	public ResponseEntity update(BankAccount bankAccountUpdate) {
		return new ResponseEntity(repository.save(bankAccountUpdate), HttpStatus.OK);
	}

	/*
	 * Utilizamos o ResponseEntity para conseguir gerenciar os status http. ou seja,
	 * para conseguir dar uma resposta de status HTTP conforme der certo ou não.
	 * "HttpStatus.Ok, HttpStatus.INTERNAL_SERVER_ERROR" Utilizamos o return new
	 * para criar uma instância vazia do objeto ResponseEntity e retornar o
	 * HttpStatus conforme necessidade no IF
	 */
	
//	@DeleteMapping("/{id}")
//	public ResponseEntity delete(String id) {
//		repository.deleteById(id);
//
//		if (repository.findById(id).get() != null) {		
//			return new ResponseEntity("Erro ao deletar", HttpStatus.INTERNAL_SERVER_ERROR);
//		} else {
//			return new ResponseEntity(repository.findAll(), HttpStatus.OK);
//		}
//		
	
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity <?> delete(@PathVariable String id) {
	   return repository.findById(id)
	           .map(record -> {
	               repository.deleteById(id);
	               return ResponseEntity.ok().build();
	           }).orElse(ResponseEntity.notFound().build());
	}
	
//	@DeleteMapping("/{id}")
//	public ResponseEntity delete(String id) {
//		Optional<BankAccount> bankAccountOptional = repository.findById(id);
//		return new ResponseEntity("Deletado com sucesso", HttpStatus.OK);
//
//	}

//	
//	public void deleteById(String id) {
//        repository.deleteById(id);
//    }
}
