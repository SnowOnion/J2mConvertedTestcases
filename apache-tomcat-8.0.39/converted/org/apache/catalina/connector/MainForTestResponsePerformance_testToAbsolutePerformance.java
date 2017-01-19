package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponsePerformance;

public class MainForTestResponsePerformance_testToAbsolutePerformance {
    public static void main(String[] args) {
        try {
            TestResponsePerformance.setUpPerTestClass();
            TestResponsePerformance objTestResponsePerformance = new TestResponsePerformance();
            objTestResponsePerformance.setUp();
            objTestResponsePerformance.testToAbsolutePerformance();
            objTestResponsePerformance.tearDown();
            TestResponsePerformance.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
