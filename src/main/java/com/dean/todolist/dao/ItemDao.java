package com.dean.todolist.dao;

import com.dean.todolist.entity.ItemEntity;

import java.util.List;

public interface ItemDao {

    List<ItemEntity> findItemByUserId(Long userId);

    ItemEntity findItemById(Long id);

    void saveItem(ItemEntity itemEntity);

    void updateItem(ItemEntity itemEntity);

    void deleteItemById(Long id);

}
