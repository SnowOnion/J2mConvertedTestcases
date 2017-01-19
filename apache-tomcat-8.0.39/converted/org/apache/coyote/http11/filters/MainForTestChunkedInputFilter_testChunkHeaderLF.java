package org.apache.coyote.http11.filters;

import org.apache.coyote.http11.filters.TestChunkedInputFilter;

public class MainForTestChunkedInputFilter_testChunkHeaderLF {
    public static void main(String[] args) {
        try {
            TestChunkedInputFilter.setUpPerTestClass();
            TestChunkedInputFilter objTestChunkedInputFilter = new TestChunkedInputFilter();
            objTestChunkedInputFilter.setUp();
            objTestChunkedInputFilter.testChunkHeaderLF();
            objTestChunkedInputFilter.tearDown();
            TestChunkedInputFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
