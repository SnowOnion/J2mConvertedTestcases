package org.apache.catalina.comet;

import org.apache.catalina.comet.TestCometProcessor;

public class MainForTestCometProcessor_testSimpleCometClientBeginFail {
    public static void main(String[] args) {
        try {
            TestCometProcessor.setUpPerTestClass();
            TestCometProcessor objTestCometProcessor = new TestCometProcessor();
            objTestCometProcessor.setUp();
            objTestCometProcessor.testSimpleCometClientBeginFail();
            objTestCometProcessor.tearDown();
            TestCometProcessor.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
