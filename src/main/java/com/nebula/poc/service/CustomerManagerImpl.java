package com.nebula.poc.service;

import com.nebula.poc.dao.AddressDAO;
import com.nebula.poc.dao.CustomerDAO;
import com.nebula.poc.model.Customer;
import org.springframework.transaction.annotation.Transactional;

public class CustomerManagerImpl implements CustomerManager {

    private CustomerDAO customerDAO;
    private AddressDAO addressDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
        addressDAO.save(cust.getAddress());
		customerDAO.save(cust);
	}

}
