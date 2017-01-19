package org.apache.catalina.valves;

import org.apache.catalina.valves.TestErrorReportValve;

public class MainForTestErrorReportValve_testBug53071 {
    public static void main(String[] args) {
        try {
            TestErrorReportValve.setUpPerTestClass();
            TestErrorReportValve objTestErrorReportValve = new TestErrorReportValve();
            objTestErrorReportValve.setUp();
            objTestErrorReportValve.testBug53071();
            objTestErrorReportValve.tearDown();
            TestErrorReportValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
