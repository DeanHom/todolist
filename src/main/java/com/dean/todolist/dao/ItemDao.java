package com.dean.todolist.dao;

import com.dean.todolist.entity.ItemEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@Mapper
public interface ItemDao {

    List<ItemEntity> findItem(ItemEntity itemEntity);

    void saveItem(ItemEntity itemEntity);

    void updateItem(ItemEntity itemEntity);

    void deleteItemById(Long id);

    void destroyItemById(Long id);

}
