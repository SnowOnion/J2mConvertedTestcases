package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testExactBufferSize {
    public static void main(String[] args) {
        try {
            TestGzipInterceptor objTestGzipInterceptor = new TestGzipInterceptor();
            objTestGzipInterceptor.testExactBufferSize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
