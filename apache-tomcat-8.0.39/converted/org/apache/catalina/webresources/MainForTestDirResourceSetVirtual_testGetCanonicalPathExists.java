package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetVirtual;

public class MainForTestDirResourceSetVirtual_testGetCanonicalPathExists {
    public static void main(String[] args) {
        try {
            TestDirResourceSetVirtual.before();
            TestDirResourceSetVirtual objTestDirResourceSetVirtual = new TestDirResourceSetVirtual();
            objTestDirResourceSetVirtual.setup();
            objTestDirResourceSetVirtual.testGetCanonicalPathExists();
            objTestDirResourceSetVirtual.teardown();
            TestDirResourceSetVirtual.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
