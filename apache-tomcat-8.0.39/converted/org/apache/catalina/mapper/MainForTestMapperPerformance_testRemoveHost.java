package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperPerformance;

public class MainForTestMapperPerformance_testRemoveHost {
    public static void main(String[] args) {
        try {
            TestMapperPerformance.setUpPerTestClass();
            TestMapperPerformance objTestMapperPerformance = new TestMapperPerformance();
            objTestMapperPerformance.setUp();
            objTestMapperPerformance.testRemoveHost();
            objTestMapperPerformance.tearDown();
            TestMapperPerformance.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
