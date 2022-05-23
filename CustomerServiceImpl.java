package com.demo.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Customer;
import com.demo.repositories.CustomerRepository;

@Transactional
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return this.customerRepository.findAll();
	}

	public List<Customer> search(String keyword) {
		return this.customerRepository.search(keyword);
	}

}
