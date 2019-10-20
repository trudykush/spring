package com.kush.spring.service;

import java.util.List;

import com.kush.spring.model.Customer;
import com.kush.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
//	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
