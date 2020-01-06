package com.dean.todolist.controller;

import com.dean.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/todo")
    public String toDoList(ModelMap map){


        return "index";
    }
}
