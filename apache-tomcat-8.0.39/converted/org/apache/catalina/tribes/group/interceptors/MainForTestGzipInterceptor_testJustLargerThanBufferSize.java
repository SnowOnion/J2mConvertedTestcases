package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testJustLargerThanBufferSize {
    public static void main(String[] args) {
        try {
            TestGzipInterceptor objTestGzipInterceptor = new TestGzipInterceptor();
            objTestGzipInterceptor.testJustLargerThanBufferSize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
