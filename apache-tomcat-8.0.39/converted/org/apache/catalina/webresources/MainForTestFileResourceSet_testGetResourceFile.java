package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResourceSet;

public class MainForTestFileResourceSet_testGetResourceFile {
    public static void main(String[] args) {
        try {
            TestFileResourceSet.before();
            TestFileResourceSet objTestFileResourceSet = new TestFileResourceSet();
            objTestFileResourceSet.setup();
            objTestFileResourceSet.testGetResourceFile();
            objTestFileResourceSet.teardown();
            TestFileResourceSet.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
