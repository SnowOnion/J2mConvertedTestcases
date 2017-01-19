package org.apache.jasper.tagplugins.jstl.core;

import org.apache.jasper.tagplugins.jstl.core.TestOut;

public class MainForTestOut_testBug54011 {
    public static void main(String[] args) {
        try {
            TestOut.setUpPerTestClass();
            TestOut objTestOut = new TestOut();
            objTestOut.setUp();
            objTestOut.testBug54011();
            objTestOut.tearDown();
            TestOut.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
