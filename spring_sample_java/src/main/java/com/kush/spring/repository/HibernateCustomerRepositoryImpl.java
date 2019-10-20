package com.kush.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.kush.spring.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		
		List<Customer> customersList = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Kushal");
		customer.setLastName("Mishra");
		
		customersList.add(customer);
		
		return customersList;
	}

}
