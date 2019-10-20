package com.age.springbootmybatistest.service;

import com.age.springbootmybatistest.mapper.MybatisTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisTestService {

    @Autowired
    private MybatisTestMapper mybatisTestMapper;

    public String run(){
        try {
            String userName = mybatisTestMapper.mybatisTest();
            return userName;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
