package com.lsgggg123.blank.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 业务测试类
 * Created by lsgggg123 on 16/6/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class TestServiceTest {
    private Logger logger = LoggerFactory.getLogger(TestServiceTest.class);

    @Autowired
    private TestService testService;

    @Test
    public void testQueryById() throws Exception {
        com.lsgggg123.blank.entity.Test test = testService.queryById(1);
        logger.info(test.toString());
    }

    @Test
    public void testGetSeckillList() throws Exception {
        List<com.lsgggg123.blank.entity.Test> tests = testService.getAll();
        System.out.println(tests.size());
        logger.info(String.valueOf(tests.size()));
    }
}