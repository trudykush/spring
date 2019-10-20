package com.kush.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kush.spring.model.Customer;
import com.kush.spring.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	//@Autowired
	private CustomerRepository customerRepository;
	
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		
		System.out.println("I am using Setter level injection in autowire");
		this.customerRepository = customerRepository;
	}



	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
