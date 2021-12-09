package com.bank.consumer.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.consumer.model.customer;




@Repository
public interface BankDaoJpa extends JpaRepository<customer, Integer> {

}
