package com.lsgggg123.blank.dao;

import com.lsgggg123.blank.entity.Test;

import java.util.List;

/**
 * Test dao
 * Created by lsgggg123 on 16/6/1.
 */
public interface TestDao {
    /**
     * 主键查询
     * @param id
     * @return
     */
    Test queryById(long id);

    /**
     * 查询所有
     * @return
     */
    List<Test> queryAll();
}
