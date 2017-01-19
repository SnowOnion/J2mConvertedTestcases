package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSetInternal;

public class MainForTestJarResourceSetInternal_testListFile {
    public static void main(String[] args) {
        try {
            TestJarResourceSetInternal objTestJarResourceSetInternal = new TestJarResourceSetInternal();
            objTestJarResourceSetInternal.setup();
            objTestJarResourceSetInternal.testListFile();
            objTestJarResourceSetInternal.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
