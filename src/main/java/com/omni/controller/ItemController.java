package com.omni.controller;

import java.awt.MenuItem;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.omi.model.Item;
import com.omni.DAO.ItemRepository;


@RestController
@RequestMapping("/Items")
public class ItemController {
	   @Autowired
	    private ItemRepository mir;

	    @GetMapping("/")
	    public List<Item> getItems() {
	        return (List<Item>) mir.findAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Item> getItemById(@PathVariable("id") Long id) {
	        return mir.findById(id);
	    }

	    @PostMapping("/")
	    @ResponseStatus(HttpStatus.CREATED)
	    public void saveItem(@RequestBody List<Item> itemList) {
	        mir.saveAll(itemList);
	    }

	    @DeleteMapping("/")
	    public void deleteAll() {
	        mir.deleteAll();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteById(@PathVariable("id") Long id) {
	        mir.deleteById(id);
	    }
}
