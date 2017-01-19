package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResource;

public class MainForTestFileResource_testGetCodePath {
    public static void main(String[] args) {
        try {
            TestFileResource.setUpPerTestClass();
            TestFileResource objTestFileResource = new TestFileResource();
            objTestFileResource.setUp();
            objTestFileResource.testGetCodePath();
            objTestFileResource.tearDown();
            TestFileResource.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
