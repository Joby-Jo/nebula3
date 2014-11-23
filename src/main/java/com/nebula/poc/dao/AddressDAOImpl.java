package com.nebula.poc.dao;

import com.nebula.poc.model.Address;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by josephj on 22/11/14.
 */
public class AddressDAOImpl implements AddressDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Address address) {
        em.persist(address);
    }
}
