package com.nebula.poc.model;

import javax.persistence.EntityManager;

/**
 * Created by josephj on 23/11/14.
 */
public abstract class BaseObject {

    public void save(EntityManager em) {
        em.persist(this);
    }
}
