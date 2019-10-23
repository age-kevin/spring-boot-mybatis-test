package com.age.springbootmybatistest.service;

import com.age.springbootmybatistest.entity.BulkInsertTest;
import com.age.springbootmybatistest.mapper.MybatisTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MybatisTestService {

    @Autowired
    private MybatisTestMapper mybatisTestMapper;

    public void run(){
        try {
            int num1 = 10000;
            int num2 = 100000;
            BulkInsertTest bulkInsertTest = new BulkInsertTest();
            for (int j = 0; j< num1; j++){
                List<BulkInsertTest> bulkInsertTestList = new ArrayList<>();
                for (int i = 0; i < num2; i++){
                    String uuid = String.valueOf(UUID.randomUUID());
                    bulkInsertTest.setDrSeg1("DR_SEG1_"+uuid);
                    bulkInsertTest.setDrSeg2("DR_SEG2_"+uuid);
                    bulkInsertTest.setDrSeg3("DR_SEG3_"+uuid);
                    bulkInsertTest.setDrSeg4("DR_SEG4_"+uuid);
                    bulkInsertTest.setDrSeg5("DR_SEG5_"+uuid);
                    bulkInsertTestList.add(bulkInsertTest);
                }
                mybatisTestMapper.mybatisTest(bulkInsertTestList);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
