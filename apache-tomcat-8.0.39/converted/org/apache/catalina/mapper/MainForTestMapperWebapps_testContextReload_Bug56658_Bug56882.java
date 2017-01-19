package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testContextReload_Bug56658_Bug56882 {
    public static void main(String[] args) {
        try {
            TestMapperWebapps.setUpPerTestClass();
            TestMapperWebapps objTestMapperWebapps = new TestMapperWebapps();
            objTestMapperWebapps.setUp();
            objTestMapperWebapps.testContextReload_Bug56658_Bug56882();
            objTestMapperWebapps.tearDown();
            TestMapperWebapps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
