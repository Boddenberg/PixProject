package com.boddenberg.pixproject.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

	@Id
	private Long accountNumber;
	
	private String agencia;
	
	private String banco;
	
	private PixKey[] pix;
	
	private double saldo;
	
}
