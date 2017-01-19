package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResourceSetReadOnly;

public class MainForTestFileResourceSetReadOnly_testGetCanonicalPathDoesNotExist {
    public static void main(String[] args) {
        try {
            TestFileResourceSetReadOnly.before();
            TestFileResourceSetReadOnly objTestFileResourceSetReadOnly = new TestFileResourceSetReadOnly();
            objTestFileResourceSetReadOnly.setup();
            objTestFileResourceSetReadOnly.testGetCanonicalPathDoesNotExist();
            objTestFileResourceSetReadOnly.teardown();
            TestFileResourceSetReadOnly.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
