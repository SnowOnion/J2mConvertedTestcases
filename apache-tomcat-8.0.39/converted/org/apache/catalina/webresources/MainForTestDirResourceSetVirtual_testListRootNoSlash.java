package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetVirtual;

public class MainForTestDirResourceSetVirtual_testListRootNoSlash {
    public static void main(String[] args) {
        try {
            TestDirResourceSetVirtual.before();
            TestDirResourceSetVirtual objTestDirResourceSetVirtual = new TestDirResourceSetVirtual();
            objTestDirResourceSetVirtual.setup();
            objTestDirResourceSetVirtual.testListRootNoSlash();
            objTestDirResourceSetVirtual.teardown();
            TestDirResourceSetVirtual.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
