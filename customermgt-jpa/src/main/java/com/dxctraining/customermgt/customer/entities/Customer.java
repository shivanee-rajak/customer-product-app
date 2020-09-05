package com.dxctraining.customermgt.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details_table")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public Customer() {
		
	}

	 public Customer(String name) {
		 this.name=name;
	 }
	 
	 public int hashcode() {
		 return id;
	 }
		 
	 @Override
			public boolean equals(Object obj) {
				if (this == obj) {
					return true;
				}
				if (obj == null || getClass() != obj.getClass()) {
					return false;
				}
				Customer that = (Customer) obj;
				return this.id == that.id;
			}
	 }

