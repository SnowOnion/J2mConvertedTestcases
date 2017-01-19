package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testRedirect {
    public static void main(String[] args) {
        try {
            TestMapperWebapps.setUpPerTestClass();
            TestMapperWebapps objTestMapperWebapps = new TestMapperWebapps();
            objTestMapperWebapps.setUp();
            objTestMapperWebapps.testRedirect();
            objTestMapperWebapps.tearDown();
            TestMapperWebapps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
