package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSetInternal;

public class MainForTestJarResourceSetInternal_testListDirB {
    public static void main(String[] args) {
        try {
            TestJarResourceSetInternal objTestJarResourceSetInternal = new TestJarResourceSetInternal();
            objTestJarResourceSetInternal.setup();
            objTestJarResourceSetInternal.testListDirB();
            objTestJarResourceSetInternal.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
