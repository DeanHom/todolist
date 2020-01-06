package com.dean.todolist.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private Integer status;

}
