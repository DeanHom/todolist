package com.dean.todolist.service.impl;

import com.dean.todolist.dao.ItemDao;
import com.dean.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;


}
