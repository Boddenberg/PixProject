package com.boddenberg.pixproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boddenberg.pixproject.entity.BankAccount;

@Repository
public interface BankAccountRepository extends MongoRepository<BankAccount, String>{

}
