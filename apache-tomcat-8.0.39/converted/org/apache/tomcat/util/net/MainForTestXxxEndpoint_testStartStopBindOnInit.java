package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestXxxEndpoint;

public class MainForTestXxxEndpoint_testStartStopBindOnInit {
    public static void main(String[] args) {
        try {
            TestXxxEndpoint.setUpPerTestClass();
            TestXxxEndpoint objTestXxxEndpoint = new TestXxxEndpoint();
            objTestXxxEndpoint.setUp();
            objTestXxxEndpoint.testStartStopBindOnInit();
            objTestXxxEndpoint.tearDown();
            TestXxxEndpoint.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
