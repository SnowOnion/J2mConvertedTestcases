package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TesterConnectionLimit;

public class MainForTesterConnectionLimit_testSingleMachine {
    public static void main(String[] args) {
        try {
            TesterConnectionLimit.setUpPerTestClass();
            TesterConnectionLimit objTesterConnectionLimit = new TesterConnectionLimit();
            objTesterConnectionLimit.setUp();
            objTesterConnectionLimit.testSingleMachine();
            objTesterConnectionLimit.tearDown();
            TesterConnectionLimit.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
