package com.kush.spring.repository;

import java.util.List;

import com.kush.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}