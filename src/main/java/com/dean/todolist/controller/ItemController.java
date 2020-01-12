package com.dean.todolist.controller;

import com.dean.todolist.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class ItemController {

    /*@Autowired
    private ItemService itemService;*/

    @RequestMapping("/todo")
    public String toDoList(Map<String, Object> map){

        map.put("key", "hello");
        return "mainIndex";
    }
}
