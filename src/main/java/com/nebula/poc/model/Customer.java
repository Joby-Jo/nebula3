package com.nebula.poc.model;

import com.sun.javafx.beans.annotations.NonNull;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class Customer extends BaseObject {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

    @Column(nullable = false)
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
