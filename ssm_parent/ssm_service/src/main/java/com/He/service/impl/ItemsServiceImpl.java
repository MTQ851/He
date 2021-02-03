package com.He.service.impl;

import com.He.dao.ItemsDao;
import com.He.pojo.Items;
import com.He.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    public int save(Items items) {
        int row = itemsDao.save(items);
        return row;
    }
}
