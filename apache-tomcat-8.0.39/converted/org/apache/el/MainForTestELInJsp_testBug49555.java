package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug49555 {
    public static void main(String[] args) {
        try {
            TestELInJsp.setUpPerTestClass();
            TestELInJsp objTestELInJsp = new TestELInJsp();
            objTestELInJsp.setUp();
            objTestELInJsp.testBug49555();
            objTestELInJsp.tearDown();
            TestELInJsp.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
