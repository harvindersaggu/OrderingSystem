package com.omi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
    @GeneratedValue
	private Long orderId;
	
	public Order() {
		super();
	}

	private List<Item> items;
	
	private String email;
	
	public Order(Long orderId, List<Item> items, String email) {
		super();
		this.orderId = orderId;
		this.items = items;
		this.email = email;
	}

	public Long getOrderId() {
		return orderId;
	}

	public List<Item> getItems() {
		return items;
	}

	public String getEmail() {
		return email;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
