package com.dean.todolist.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ItemEntity extends BaseEntity{

    private String itemName;

    private String itemContent;

    private Integer level;

    private Date deadLine;

    private Long parentId;

    private Long userId;
}
