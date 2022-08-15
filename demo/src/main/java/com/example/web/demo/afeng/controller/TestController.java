package com.example.web.demo.afeng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: 闫国栋
 * @create: 2022-08-14 13:43
 **/

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/springboot")
    public String testSpringBoot(){
        return "Welcome to the world of spring boot!";
    }
}
