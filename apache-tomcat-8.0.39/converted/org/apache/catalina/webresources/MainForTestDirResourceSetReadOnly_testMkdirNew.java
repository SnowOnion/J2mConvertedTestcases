package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetReadOnly;

public class MainForTestDirResourceSetReadOnly_testMkdirNew {
    public static void main(String[] args) {
        try {
            TestDirResourceSetReadOnly objTestDirResourceSetReadOnly = new TestDirResourceSetReadOnly();
            objTestDirResourceSetReadOnly.setup();
            objTestDirResourceSetReadOnly.testMkdirNew();
            objTestDirResourceSetReadOnly.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
