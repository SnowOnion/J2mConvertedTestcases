package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetReadOnly;

public class MainForTestDirResourceSetReadOnly_testMkdirRoot {
    public static void main(String[] args) {
        try {
            TestDirResourceSetReadOnly objTestDirResourceSetReadOnly = new TestDirResourceSetReadOnly();
            objTestDirResourceSetReadOnly.setup();
            objTestDirResourceSetReadOnly.testMkdirRoot();
            objTestDirResourceSetReadOnly.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
