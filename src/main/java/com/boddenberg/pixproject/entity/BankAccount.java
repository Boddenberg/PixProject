package com.boddenberg.pixproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Conta")
public class BankAccount {

	@Id
	private String id;
	
	private String agencia;
	
	private String banco;
	
//	private PixKey[] pix;
//
//	private double saldo;	
	

	
	
	public BankAccount(String agencia, String banco) {
		this.agencia = agencia;
		this.banco = banco;
	}

	public BankAccount() {}
	

	public BankAccount(String accountNumber, String agencia, String banco) {
		this.id = accountNumber;
		this.agencia = agencia;
		this.banco = banco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	
	
	
	
	

	
	
	
}
