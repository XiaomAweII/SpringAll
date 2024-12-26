package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.BlogProperties;
import com.springboot.bean.ConfigBean;
import com.springboot.bean.TestConfigBean;


@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private TestConfigBean testConfigBean;

    @GetMapping("/blog")
    String blog() {
        return blogProperties.toString();
    }

    @GetMapping("/config")
    String config(){
        return configBean.toString();
    }

    @GetMapping("/test")
    String test() {
        return testConfigBean.getName() + "，" + testConfigBean.getAge();
    }
}
