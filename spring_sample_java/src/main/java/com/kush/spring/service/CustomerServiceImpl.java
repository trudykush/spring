package com.kush.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.kush.spring.model.Customer;
import com.kush.spring.repository.CustomerRepository;

@Service("customerService")
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {


	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl () {
		
	}

	public CustomerServiceImpl (CustomerRepository customerRepository) {
		System.out.println("In Constructor Injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("In Setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
