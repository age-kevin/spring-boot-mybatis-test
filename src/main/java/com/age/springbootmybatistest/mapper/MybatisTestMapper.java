package com.age.springbootmybatistest.mapper;

import com.age.springbootmybatistest.entity.BulkInsertTest;

import java.util.List;

public interface MybatisTestMapper {
    void mybatisTest(List<BulkInsertTest> bulkInsertTestList);
}
