package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetInternal;

public class MainForTestDirResourceSetInternal_testListWebAppPathsFile {
    public static void main(String[] args) {
        try {
            TestDirResourceSetInternal.before();
            TestDirResourceSetInternal objTestDirResourceSetInternal = new TestDirResourceSetInternal();
            objTestDirResourceSetInternal.setup();
            objTestDirResourceSetInternal.testListWebAppPathsFile();
            objTestDirResourceSetInternal.teardown();
            TestDirResourceSetInternal.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
