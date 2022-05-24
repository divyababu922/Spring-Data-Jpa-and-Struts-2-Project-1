package com.demo.repositories;
import java.util.List;
import com.demo.entities.Customer;

public interface CustomerRepository {
	
	public List<Customer> findAll();

	public List<Customer> search(String keyword);

}

