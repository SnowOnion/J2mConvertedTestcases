package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testNonAsciiPathRedirect {
    public static void main(String[] args) {
        try {
            TestRewriteValve.setUpPerTestClass();
            TestRewriteValve objTestRewriteValve = new TestRewriteValve();
            objTestRewriteValve.setUp();
            objTestRewriteValve.testNonAsciiPathRedirect();
            objTestRewriteValve.tearDown();
            TestRewriteValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
