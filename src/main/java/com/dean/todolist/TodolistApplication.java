package com.dean.todolist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.dean.todolist.dao")
@SpringBootApplication
public class TodolistApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

}
