package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testBug45427 {
    public static void main(String[] args) {
        try {
            TestELInJsp.setUpPerTestClass();
            TestELInJsp objTestELInJsp = new TestELInJsp();
            objTestELInJsp.setUp();
            objTestELInJsp.testBug45427();
            objTestELInJsp.tearDown();
            TestELInJsp.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
