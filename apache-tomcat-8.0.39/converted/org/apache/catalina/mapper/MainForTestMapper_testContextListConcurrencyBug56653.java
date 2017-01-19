package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testContextListConcurrencyBug56653 {
    public static void main(String[] args) {
        try {
            TestMapper.setUpPerTestClass();
            TestMapper objTestMapper = new TestMapper();
            objTestMapper.setUp();
            objTestMapper.testContextListConcurrencyBug56653();
            objTestMapper.tearDown();
            TestMapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
