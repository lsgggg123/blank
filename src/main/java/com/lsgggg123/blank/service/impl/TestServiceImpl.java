package com.lsgggg123.blank.service.impl;

import com.lsgggg123.blank.dao.TestDao;
import com.lsgggg123.blank.entity.Test;
import com.lsgggg123.blank.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Test业务实现类
 * Created by lsgggg123 on 16/6/2.
 */
@Service
public class TestServiceImpl implements TestService {
    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private TestDao testDao;

    @Override
    public Test queryById(long id) {
        return testDao.queryById(id);
    }

    @Override
    public List<Test> getAll() {
        return testDao.queryAll();
    }
}
