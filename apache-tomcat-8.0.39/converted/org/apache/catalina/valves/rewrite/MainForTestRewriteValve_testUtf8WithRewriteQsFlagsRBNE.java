package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8WithRewriteQsFlagsRBNE {
    public static void main(String[] args) {
        try {
            TestRewriteValve.setUpPerTestClass();
            TestRewriteValve objTestRewriteValve = new TestRewriteValve();
            objTestRewriteValve.setUp();
            objTestRewriteValve.testUtf8WithRewriteQsFlagsRBNE();
            objTestRewriteValve.tearDown();
            TestRewriteValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
