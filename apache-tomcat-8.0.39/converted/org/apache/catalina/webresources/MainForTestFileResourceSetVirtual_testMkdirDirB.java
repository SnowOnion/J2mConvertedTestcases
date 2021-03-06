package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResourceSetVirtual;

public class MainForTestFileResourceSetVirtual_testMkdirDirB {
    public static void main(String[] args) {
        try {
            TestFileResourceSetVirtual.before();
            TestFileResourceSetVirtual objTestFileResourceSetVirtual = new TestFileResourceSetVirtual();
            objTestFileResourceSetVirtual.setup();
            objTestFileResourceSetVirtual.testMkdirDirB();
            objTestFileResourceSetVirtual.teardown();
            TestFileResourceSetVirtual.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
