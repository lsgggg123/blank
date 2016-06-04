package com.lsgggg123.blank.controller;

import com.lsgggg123.blank.entity.Test;
import com.lsgggg123.blank.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试控制器
 * Created by lsgggg123 on 16/6/2.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("all")
    @ResponseBody
    public Object test() {
        Map<String, Object> response = new HashMap<>();
        List<Test> tests = testService.getAll();
        response.put("tests", tests);
        return response;
    }

    @RequestMapping("one/{id}")
    @ResponseBody
    public Object one(@PathVariable("id") long id, @RequestParam("ch") String ch) {
        Map<String, Object> response = new HashMap<>();
        Test test = testService.queryById(id);
        response.put("test", test);
        response.put("ch", ch);
        response.put("date", new Date());
        return response;
    }
}
