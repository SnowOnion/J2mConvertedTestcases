package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSet;

public class MainForTestDirResourceSet_testListFile {
    public static void main(String[] args) {
        try {
            TestDirResourceSet.before();
            TestDirResourceSet objTestDirResourceSet = new TestDirResourceSet();
            objTestDirResourceSet.setup();
            objTestDirResourceSet.testListFile();
            objTestDirResourceSet.teardown();
            TestDirResourceSet.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
