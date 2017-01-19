package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testOneRelease {
    public static void main(String[] args) {
        try {
            TestLimitLatch objTestLimitLatch = new TestLimitLatch();
            objTestLimitLatch.testOneRelease();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
