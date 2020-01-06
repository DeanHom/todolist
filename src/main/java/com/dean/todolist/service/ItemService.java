package com.dean.todolist.service;

import com.dean.todolist.entity.ItemEntity;

import java.util.List;

public interface ItemService {

    List<ItemEntity> findAll(ItemEntity itemEntity);

    void createItem(ItemEntity itemEntity);


}
