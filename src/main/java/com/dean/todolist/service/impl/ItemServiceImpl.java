package com.dean.todolist.service.impl;

import com.dean.todolist.entity.ItemEntity;
import com.dean.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {


    @Override
    public List<ItemEntity> findAll(ItemEntity itemEntity) {
        return null;
    }

    @Override
    public void createItem(ItemEntity itemEntity) {

    }
}
