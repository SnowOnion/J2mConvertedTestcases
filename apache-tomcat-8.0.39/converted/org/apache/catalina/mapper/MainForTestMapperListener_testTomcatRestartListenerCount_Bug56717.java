package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperListener;

public class MainForTestMapperListener_testTomcatRestartListenerCount_Bug56717 {
    public static void main(String[] args) {
        try {
            TestMapperListener.setUpPerTestClass();
            TestMapperListener objTestMapperListener = new TestMapperListener();
            objTestMapperListener.setUp();
            objTestMapperListener.testTomcatRestartListenerCount_Bug56717();
            objTestMapperListener.tearDown();
            TestMapperListener.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
