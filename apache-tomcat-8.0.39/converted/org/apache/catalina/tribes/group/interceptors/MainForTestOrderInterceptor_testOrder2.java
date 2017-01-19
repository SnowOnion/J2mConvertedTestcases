package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestOrderInterceptor;

public class MainForTestOrderInterceptor_testOrder2 {
    public static void main(String[] args) {
        try {
            TestOrderInterceptor objTestOrderInterceptor = new TestOrderInterceptor();
            objTestOrderInterceptor.setUp();
            objTestOrderInterceptor.testOrder2();
            objTestOrderInterceptor.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
