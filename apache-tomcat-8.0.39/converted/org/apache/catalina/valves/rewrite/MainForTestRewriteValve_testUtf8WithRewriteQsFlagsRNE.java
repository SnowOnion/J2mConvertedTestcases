package org.apache.catalina.valves.rewrite;

import org.apache.catalina.valves.rewrite.TestRewriteValve;

public class MainForTestRewriteValve_testUtf8WithRewriteQsFlagsRNE {
    public static void main(String[] args) {
        try {
            TestRewriteValve.setUpPerTestClass();
            TestRewriteValve objTestRewriteValve = new TestRewriteValve();
            objTestRewriteValve.setUp();
            objTestRewriteValve.testUtf8WithRewriteQsFlagsRNE();
            objTestRewriteValve.tearDown();
            TestRewriteValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
