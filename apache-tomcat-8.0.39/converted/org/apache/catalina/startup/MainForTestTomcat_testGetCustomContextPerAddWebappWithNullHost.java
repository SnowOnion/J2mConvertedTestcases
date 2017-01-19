package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetCustomContextPerAddWebappWithNullHost {
    public static void main(String[] args) {
        try {
            TestTomcat.setUpPerTestClass();
            TestTomcat objTestTomcat = new TestTomcat();
            objTestTomcat.setUp();
            objTestTomcat.testGetCustomContextPerAddWebappWithNullHost();
            objTestTomcat.tearDown();
            TestTomcat.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
