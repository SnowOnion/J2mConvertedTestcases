package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestJspWriterImpl;

public class MainForTestJspWriterImpl_bug54241b {
    public static void main(String[] args) {
        try {
            TestJspWriterImpl.setUpPerTestClass();
            TestJspWriterImpl objTestJspWriterImpl = new TestJspWriterImpl();
            objTestJspWriterImpl.setUp();
            objTestJspWriterImpl.bug54241b();
            objTestJspWriterImpl.tearDown();
            TestJspWriterImpl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
