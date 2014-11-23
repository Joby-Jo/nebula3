package com.nebula.poc.model;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;

    @ManyToOne
    @JoinColumn(name="address_id")
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
