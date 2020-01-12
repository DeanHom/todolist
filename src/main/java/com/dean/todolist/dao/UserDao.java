package com.dean.todolist.dao;

import com.dean.todolist.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    UserEntity findUser(UserEntity userEntity);

    void saveUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

    void deleteUser(UserEntity userEntity);

}
