package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetReadOnly;

public class MainForTestDirResourceSetReadOnly_testWriteEmpty {
    public static void main(String[] args) {
        try {
            TestDirResourceSetReadOnly objTestDirResourceSetReadOnly = new TestDirResourceSetReadOnly();
            objTestDirResourceSetReadOnly.setup();
            objTestDirResourceSetReadOnly.testWriteEmpty();
            objTestDirResourceSetReadOnly.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
