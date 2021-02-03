package com;

import com.He.pojo.Items;
import com.He.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


public class TestService {

    @Test
    public void Test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:AppConfig.xml");
        ItemsService itemsService = context.getBean(ItemsService.class);
        List<Items> all = itemsService.findAll();
        for (Items list : all) {
            System.out.println(list);
        }
    }
    @Test
    public void add() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:AppConfig.xml");
        ItemsService itemsService = context.getBean(ItemsService.class);
        Items items = new Items();
        items.setName("何小源");
        items.setPrice(6666.0);
        itemsService.save(items);
    }
}
