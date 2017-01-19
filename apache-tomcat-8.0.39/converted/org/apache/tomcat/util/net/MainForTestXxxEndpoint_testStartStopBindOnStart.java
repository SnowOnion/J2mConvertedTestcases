package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestXxxEndpoint;

public class MainForTestXxxEndpoint_testStartStopBindOnStart {
    public static void main(String[] args) {
        try {
            TestXxxEndpoint.setUpPerTestClass();
            TestXxxEndpoint objTestXxxEndpoint = new TestXxxEndpoint();
            objTestXxxEndpoint.setUp();
            objTestXxxEndpoint.testStartStopBindOnStart();
            objTestXxxEndpoint.tearDown();
            TestXxxEndpoint.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
