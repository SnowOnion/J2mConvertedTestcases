package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestSet;

public class MainForTestSet_testBug54011 {
    public static void main(String[] args) {
        try {
            TestSet.setUpPerTestClass();
            TestSet objTestSet = new TestSet();
            objTestSet.setUp();
            objTestSet.testBug54011();
            objTestSet.tearDown();
            TestSet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
