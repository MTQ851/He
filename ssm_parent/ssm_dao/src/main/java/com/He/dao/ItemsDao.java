package com.He.dao;

import com.He.pojo.Items;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface ItemsDao {
    @Select("select * from items")
    List<Items> findAll();
    int save(Items items);

}
