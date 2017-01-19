package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testReloadContextVersion {
    public static void main(String[] args) {
        try {
            TestMapper.setUpPerTestClass();
            TestMapper objTestMapper = new TestMapper();
            objTestMapper.setUp();
            objTestMapper.testReloadContextVersion();
            objTestMapper.tearDown();
            TestMapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
