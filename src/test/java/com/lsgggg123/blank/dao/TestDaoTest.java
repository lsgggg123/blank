package com.lsgggg123.blank.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试类1
 * Created by lsgggg123 on 16/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class TestDaoTest {
    @Autowired
    private TestDao testDao;


    @Test
    public void testQueryById() throws Exception {
        com.lsgggg123.blank.entity.Test test = testDao.queryById(1);
        System.out.println(test);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<com.lsgggg123.blank.entity.Test> tests = testDao.queryAll();
        System.out.println(tests);

    }
}