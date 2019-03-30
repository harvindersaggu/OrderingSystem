package com.omni.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.omi.model.Item;
import com.omi.model.Order;
import com.omni.DAO.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

	  @Autowired
	    private OrderRepository orderRes;

	    @GetMapping("/")
	    public List<Order> getOrders() {
	        return (List<Order>) orderRes.findAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Order> getOrderById(@PathVariable("id") Long id) {
	        return orderRes.findById(id);
	    }

	    @PostMapping("/")
	    @ResponseStatus(HttpStatus.CREATED)
	    public void saveOrder(@RequestBody List<Order> itemList) {
	    	orderRes.saveAll(itemList);
	    }

}
