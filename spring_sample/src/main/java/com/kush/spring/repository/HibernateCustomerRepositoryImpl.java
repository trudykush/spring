package com.kush.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.kush.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customersList = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Kushal");
		customer.setLastName("Mishra");
		
		customersList.add(customer);
		
		return customersList;
	}

}
