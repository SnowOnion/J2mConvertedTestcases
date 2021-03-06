package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetReadOnly;

public class MainForTestDirResourceSetReadOnly_testWriteNull {
    public static void main(String[] args) {
        try {
            TestDirResourceSetReadOnly objTestDirResourceSetReadOnly = new TestDirResourceSetReadOnly();
            objTestDirResourceSetReadOnly.setup();
            objTestDirResourceSetReadOnly.testWriteNull();
            objTestDirResourceSetReadOnly.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
