package com.bank.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.consumer.jpa.BankDaoJpa;
import com.bank.consumer.model.customer;

@RestController
public class ConsumerController {

	@Autowired
	private BankDaoJpa bankDaoJpa;
	
	@RequestMapping(value = "/getAllCustomerDetails", method = RequestMethod.GET)
	  public List<customer> getAllProducts(){
		  
			 return bankDaoJpa.findAll();
		}
	
}
