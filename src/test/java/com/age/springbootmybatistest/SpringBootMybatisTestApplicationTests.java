package com.age.springbootmybatistest;

import com.age.springbootmybatistest.service.MybatisTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootMybatisTestApplicationTests {

    @Autowired
    MybatisTestService mybatisTestService;

    @Test
    public void contextLoads() {

    }

    @Test
    public void mybatisTest(){
        System.out.println(mybatisTestService.run());
    }
}
