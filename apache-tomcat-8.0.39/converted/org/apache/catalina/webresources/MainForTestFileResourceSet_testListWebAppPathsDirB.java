package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResourceSet;

public class MainForTestFileResourceSet_testListWebAppPathsDirB {
    public static void main(String[] args) {
        try {
            TestFileResourceSet.before();
            TestFileResourceSet objTestFileResourceSet = new TestFileResourceSet();
            objTestFileResourceSet.setup();
            objTestFileResourceSet.testListWebAppPathsDirB();
            objTestFileResourceSet.teardown();
            TestFileResourceSet.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
