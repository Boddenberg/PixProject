package com.boddenberg.pixproject.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document()    //O Client vai representar uma collection dentro do mongoDB
public class Client {
	
	@Id
	private Long id;
	
	private String name;
	
	private String surname;
	
	private BankAccount account;
	
	private String cpf;
	
	private String email;
	
	private String phoneNumber;
	
	private LocalDate birthDate;	

}
