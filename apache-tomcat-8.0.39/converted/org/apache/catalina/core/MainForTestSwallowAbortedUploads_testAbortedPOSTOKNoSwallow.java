package org.apache.catalina.core;

import org.apache.catalina.core.TestSwallowAbortedUploads;

public class MainForTestSwallowAbortedUploads_testAbortedPOSTOKNoSwallow {
    public static void main(String[] args) {
        try {
            TestSwallowAbortedUploads.setUpPerTestClass();
            TestSwallowAbortedUploads objTestSwallowAbortedUploads = new TestSwallowAbortedUploads();
            objTestSwallowAbortedUploads.setUp();
            objTestSwallowAbortedUploads.testAbortedPOSTOKNoSwallow();
            objTestSwallowAbortedUploads.tearDown();
            TestSwallowAbortedUploads.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
