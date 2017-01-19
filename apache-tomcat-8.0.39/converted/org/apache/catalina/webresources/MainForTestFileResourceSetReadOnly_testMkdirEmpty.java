package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResourceSetReadOnly;

public class MainForTestFileResourceSetReadOnly_testMkdirEmpty {
    public static void main(String[] args) {
        try {
            TestFileResourceSetReadOnly.before();
            TestFileResourceSetReadOnly objTestFileResourceSetReadOnly = new TestFileResourceSetReadOnly();
            objTestFileResourceSetReadOnly.setup();
            objTestFileResourceSetReadOnly.testMkdirEmpty();
            objTestFileResourceSetReadOnly.teardown();
            TestFileResourceSetReadOnly.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
