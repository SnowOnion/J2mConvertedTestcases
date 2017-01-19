package org.apache.tomcat.util.threads;

import org.apache.tomcat.util.threads.TestLimitLatch;

public class MainForTestLimitLatch_testTenWait {
    public static void main(String[] args) {
        try {
            TestLimitLatch objTestLimitLatch = new TestLimitLatch();
            objTestLimitLatch.testTenWait();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
