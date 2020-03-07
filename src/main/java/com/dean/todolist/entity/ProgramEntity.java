package com.dean.todolist.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgramEntity extends BaseEntity{

    private int num;// 序号

    private String programName;// 项目名称

    private String programContent;// 项目描述

    private Long userId;// 用户id

    @Override
    public String toString() {
        return "ProgramEntity{" +
                "num=" + num +
                ", programName='" + programName + '\'' +
                ", programContent='" + programContent + '\'' +
                ", userId=" + userId +
                '}';
    }
}
