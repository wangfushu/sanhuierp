package com.sanhui.erpapi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    public void insert() {
        com.sanhui.erpapi.entity.Test test = new com.sanhui.erpapi.entity.Test();
        test.setId(1);
        test.setName("hello");
        test.setDescription("test");
        testService.insert(test);

    }
}