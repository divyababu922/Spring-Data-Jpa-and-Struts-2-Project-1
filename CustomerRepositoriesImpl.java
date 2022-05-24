package com.demo.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.demo.entities.Customer;
import com.demo.repositories.CustomerRepository;

public class CustomerRepositoriesImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Customer> findAll() {
		try {
			return entityManager.createQuery("from customer").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Customer> search(String keyword) {
		try {
			return entityManager.createQuery("from customer where name like :keyword")
								.setParameter("keyword", "%" + keyword + "%")
								.getResultList();
		} catch (Exception e) { 
			return null;
		}
	}

}