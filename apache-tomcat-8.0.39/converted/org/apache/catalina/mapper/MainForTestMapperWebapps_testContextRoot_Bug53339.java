package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testContextRoot_Bug53339 {
    public static void main(String[] args) {
        try {
            TestMapperWebapps.setUpPerTestClass();
            TestMapperWebapps objTestMapperWebapps = new TestMapperWebapps();
            objTestMapperWebapps.setUp();
            objTestMapperWebapps.testContextRoot_Bug53339();
            objTestMapperWebapps.tearDown();
            TestMapperWebapps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
