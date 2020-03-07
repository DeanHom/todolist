package com.dean.todolist.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ItemEntity extends BaseEntity{

    private String itemName;//事项名称

    private String itemContent;// 事项内容

    private Integer level;// 级别

    private Date deadLine;// 截至时间

    private Long parentId;// 所属项目id

    private Long userId;// 用户id

    @Override
    public String toString() {
        return "ItemEntity{" +
                "itemName='" + itemName + '\'' +
                ", itemContent='" + itemContent + '\'' +
                ", level=" + level +
                ", deadLine=" + deadLine +
                ", parentId=" + parentId +
                ", userId=" + userId +
                '}';
    }
}
