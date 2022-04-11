package com.boddenberg.pixproject.controllers;

import com.boddenberg.pixproject.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.boddenberg.pixproject.service.BankAccountService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(path = "/pix")
public class BankAccountController {

		@Autowired
		BankAccountService service;
	
		@GetMapping("BankAccount")
		public ResponseEntity allKeys() {
			return service.findAll();
		}

		
		@PostMapping
		public ResponseEntity salvar(@RequestBody BankAccount bankAccount){
			System.out.println(bankAccount);
			return service.salvar(bankAccount);
		}
		
//		@PostMapping("salvar")
//       public ResponseEntity salvarBankAccount(@RequestParam("agencia")String agencia,@RequestParam("banco")String banco){
//            BankAccount bank = new BankAccount();
//            bank.setAgencia(agencia);
//            bank.setBanco(banco);
//            return service.add(bankAccount);
//        }
		
		
//		@PutMapping("Atualizar")
//		public ResponseEntity atualizar(@RequestBody BankAccount bankAccount) {
//			return service.update(bankAccount);
//		}
		
		@DeleteMapping(path = "{id}")
	    public ResponseEntity excluir(@RequestParam("id") String bankAccount){
	        return service.delete(bankAccount);
	    }
		
//		@DeleteMapping(value = "/delete/{id}")
//	    public ResponseEntity<?> delete(@PathVariable String id) {
//	        BankAccountService.deleteById(BankAccountService.findById(id).getId());
//	        return new ResponseEntity("id deleted successfully", HttpStatus.OK);
//	    }

		
		
		
		
	}

	

