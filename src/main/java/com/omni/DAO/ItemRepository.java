package com.omni.DAO;

import org.springframework.data.repository.CrudRepository;

import com.omi.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
