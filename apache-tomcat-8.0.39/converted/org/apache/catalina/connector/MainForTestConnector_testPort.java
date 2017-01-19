package org.apache.catalina.connector;

import org.apache.catalina.connector.TestConnector;

public class MainForTestConnector_testPort {
    public static void main(String[] args) {
        try {
            TestConnector.setUpPerTestClass();
            TestConnector objTestConnector = new TestConnector();
            objTestConnector.setUp();
            objTestConnector.testPort();
            objTestConnector.tearDown();
            TestConnector.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
