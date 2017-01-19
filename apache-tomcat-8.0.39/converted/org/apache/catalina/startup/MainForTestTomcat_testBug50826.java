package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testBug50826 {
    public static void main(String[] args) {
        try {
            TestTomcat.setUpPerTestClass();
            TestTomcat objTestTomcat = new TestTomcat();
            objTestTomcat.setUp();
            objTestTomcat.testBug50826();
            objTestTomcat.tearDown();
            TestTomcat.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
