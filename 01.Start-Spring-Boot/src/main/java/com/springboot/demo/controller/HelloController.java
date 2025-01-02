package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoweii
 * @create 2024-12-25 22:45
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    String hello(){
        return "Hello Spring Boot!";
    }
}
