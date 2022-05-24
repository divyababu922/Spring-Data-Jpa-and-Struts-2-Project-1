package com.demo.services;
import java.util.List;
import com.demo.entities.Customer;

public interface CustomerService {

	public List<Customer> findAll();

	public List<Customer> search(String keyword);

}