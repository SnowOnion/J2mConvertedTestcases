package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testWelcomeFileStrict {
    public static void main(String[] args) {
        try {
            TestMapperWebapps.setUpPerTestClass();
            TestMapperWebapps objTestMapperWebapps = new TestMapperWebapps();
            objTestMapperWebapps.setUp();
            objTestMapperWebapps.testWelcomeFileStrict();
            objTestMapperWebapps.tearDown();
            TestMapperWebapps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
