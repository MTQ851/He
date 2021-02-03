package com;

import com.He.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:MyBatis.xml");
        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        System.out.println(itemsDao.findAll());
    }
}
