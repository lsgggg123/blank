package com.lsgggg123.blank.service;

import com.lsgggg123.blank.entity.Test;

import java.util.List;

/**
 * Test业务接口
 * Created by lsgggg123 on 16/6/2.
 */
public interface TestService {
    Test queryById(long id);

    List<Test> getAll();
}
