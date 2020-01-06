package com.dean.todolist.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserEntity extends BaseEntity{

    private String userName;

    private String password;
}
