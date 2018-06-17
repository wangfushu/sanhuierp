package com.sanhui.erpapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangjb
 * @since 2018-06-16 17:39
 * <p>
 * 控制器基类
 */
@RestController
@RequestMapping("")
public class BaseController {

    @RequestMapping(value = "")
    public String test() {
        return "hello world";
    }
}
