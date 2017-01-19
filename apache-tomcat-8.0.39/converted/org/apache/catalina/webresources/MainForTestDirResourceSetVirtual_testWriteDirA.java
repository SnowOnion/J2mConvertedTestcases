package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetVirtual;

public class MainForTestDirResourceSetVirtual_testWriteDirA {
    public static void main(String[] args) {
        try {
            TestDirResourceSetVirtual.before();
            TestDirResourceSetVirtual objTestDirResourceSetVirtual = new TestDirResourceSetVirtual();
            objTestDirResourceSetVirtual.setup();
            objTestDirResourceSetVirtual.testWriteDirA();
            objTestDirResourceSetVirtual.teardown();
            TestDirResourceSetVirtual.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
