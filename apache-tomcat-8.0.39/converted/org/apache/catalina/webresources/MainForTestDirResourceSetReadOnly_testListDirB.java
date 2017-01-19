package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetReadOnly;

public class MainForTestDirResourceSetReadOnly_testListDirB {
    public static void main(String[] args) {
        try {
            TestDirResourceSetReadOnly objTestDirResourceSetReadOnly = new TestDirResourceSetReadOnly();
            objTestDirResourceSetReadOnly.setup();
            objTestDirResourceSetReadOnly.testListDirB();
            objTestDirResourceSetReadOnly.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
