package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestForEach;

public class MainForTestForEach_testBug54242 {
    public static void main(String[] args) {
        try {
            TestForEach.setUpPerTestClass();
            TestForEach objTestForEach = new TestForEach();
            objTestForEach.setUp();
            objTestForEach.testBug54242();
            objTestForEach.tearDown();
            TestForEach.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
