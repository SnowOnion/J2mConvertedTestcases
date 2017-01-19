package org.apache.catalina.connector;

import org.apache.catalina.connector.TestMaxConnections;

public class MainForTestMaxConnections_testConnector {
    public static void main(String[] args) {
        try {
            TestMaxConnections.setUpPerTestClass();
            TestMaxConnections objTestMaxConnections = new TestMaxConnections();
            objTestMaxConnections.setUp();
            objTestMaxConnections.testConnector();
            objTestMaxConnections.tearDown();
            TestMaxConnections.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
