package com.nebula.poc.dao;

import com.nebula.poc.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    //
//    private SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Customer customer) {
        em.persist(customer);
    }

//    @Override
//    public void save(Customer customer) {
//        Session session = this.sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
//
//        session.persist(customer);
//        session.persist(customer.getAddress());
//        tx.commit();
//        session.close();
//    }
//	@Override
//	public void create(Customer customer) {
//		String queryCustomer = "insert into Customer (id, name) values (?,?)";
//		String queryAddress = "insert into Address (id, address,country) values (?,?,?)";
//
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//
//		jdbcTemplate.update(queryCustomer, new Object[] { customer.getId(),
//				customer.getName() });
//		System.out.println("Inserted into Customer Table Successfully");
//		jdbcTemplate.update(queryAddress, new Object[] { customer.getId(),
//				customer.getAddress().getAddress(),
//				customer.getAddress().getCountry() });
//		System.out.println("Inserted into Address Table Successfully");
//	}

}
