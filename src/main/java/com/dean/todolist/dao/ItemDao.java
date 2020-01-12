package com.dean.todolist.dao;

import com.dean.todolist.entity.ItemEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ItemDao {

    List<ItemEntity> findItemByUserId(Long userId);

    @Select("select * from item where id = #{id}")
    ItemEntity findItemById(Long id);

    void saveItem(ItemEntity itemEntity);

    void updateItem(ItemEntity itemEntity);

    @Delete("delete from item where id = #{id}")
    void deleteItemById(Long id);

}
