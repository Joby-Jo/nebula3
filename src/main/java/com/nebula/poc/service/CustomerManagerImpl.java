package com.nebula.poc.service;

import com.nebula.poc.model.Customer;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomerManagerImpl implements CustomerManager {

    @PersistenceContext
    private EntityManager em;

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
        cust.getAddress().save(em);
        cust.save(em);
	}
}
