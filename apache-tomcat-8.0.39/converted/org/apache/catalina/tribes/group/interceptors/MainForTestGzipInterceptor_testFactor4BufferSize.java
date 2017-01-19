package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestGzipInterceptor;

public class MainForTestGzipInterceptor_testFactor4BufferSize {
    public static void main(String[] args) {
        try {
            TestGzipInterceptor objTestGzipInterceptor = new TestGzipInterceptor();
            objTestGzipInterceptor.testFactor4BufferSize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
