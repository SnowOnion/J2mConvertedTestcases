package org.apache.coyote.http11;

import org.apache.coyote.http11.TestGzipOutputFilter;

public class MainForTestGzipOutputFilter_testFlushingWithGzip {
    public static void main(String[] args) {
        try {
            TestGzipOutputFilter objTestGzipOutputFilter = new TestGzipOutputFilter();
            objTestGzipOutputFilter.testFlushingWithGzip();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
