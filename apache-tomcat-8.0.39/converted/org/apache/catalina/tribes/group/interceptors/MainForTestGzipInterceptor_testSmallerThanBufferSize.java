package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testSmallerThanBufferSize {
    public static void main(String[] args) {
        try {
            TestGzipInterceptor objTestGzipInterceptor = new TestGzipInterceptor();
            objTestGzipInterceptor.testSmallerThanBufferSize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
