package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetVirtual;

public class MainForTestDirResourceSetVirtual_testMkdirNew {
    public static void main(String[] args) {
        try {
            TestDirResourceSetVirtual.before();
            TestDirResourceSetVirtual objTestDirResourceSetVirtual = new TestDirResourceSetVirtual();
            objTestDirResourceSetVirtual.setup();
            objTestDirResourceSetVirtual.testMkdirNew();
            objTestDirResourceSetVirtual.teardown();
            TestDirResourceSetVirtual.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
