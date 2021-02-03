package com.He.service;

import com.He.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();
    int save(Items items);
}
