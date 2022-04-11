package com.boddenberg.pixproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boddenberg.pixproject.service.BankAccountService;

@SpringBootApplication
public class PixProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixProjectApplication.class, args);		
	}


}
