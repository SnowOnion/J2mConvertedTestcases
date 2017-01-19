package org.apache.catalina.valves;

import org.apache.catalina.valves.TestStuckThreadDetectionValve;

public class MainForTestStuckThreadDetectionValve_testInterruption {
    public static void main(String[] args) {
        try {
            TestStuckThreadDetectionValve.setUpPerTestClass();
            TestStuckThreadDetectionValve objTestStuckThreadDetectionValve = new TestStuckThreadDetectionValve();
            objTestStuckThreadDetectionValve.setUp();
            objTestStuckThreadDetectionValve.testInterruption();
            objTestStuckThreadDetectionValve.tearDown();
            TestStuckThreadDetectionValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
