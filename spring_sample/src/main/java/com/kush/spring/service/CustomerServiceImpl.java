package com.kush.spring.service;

import java.util.List;

import com.kush.spring.model.Customer;
import com.kush.spring.repository.CustomerRepository;
import com.kush.spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
