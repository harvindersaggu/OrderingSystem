package com.omni.DAO;

import org.springframework.data.repository.CrudRepository;

import com.omi.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
