package com.age.springbootmybatistest.controller;

import com.age.springbootmybatistest.service.MybatisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisTestController {

    @Autowired
    private MybatisTestService mybatisTestService;

    @GetMapping(value = "/mybatisTest")
    public void mybatisTest(){
        mybatisTestService.run();
    }
}
