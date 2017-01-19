package org.apache.el;

import org.apache.el.TestELInJsp;

public class MainForTestELInJsp_testELMethod {
    public static void main(String[] args) {
        try {
            TestELInJsp.setUpPerTestClass();
            TestELInJsp objTestELInJsp = new TestELInJsp();
            objTestELInJsp.setUp();
            objTestELInJsp.testELMethod();
            objTestELInJsp.tearDown();
            TestELInJsp.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
