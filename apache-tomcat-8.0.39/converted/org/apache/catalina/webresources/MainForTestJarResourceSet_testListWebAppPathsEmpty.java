package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSet;

public class MainForTestJarResourceSet_testListWebAppPathsEmpty {
    public static void main(String[] args) {
        try {
            TestJarResourceSet objTestJarResourceSet = new TestJarResourceSet();
            objTestJarResourceSet.setup();
            objTestJarResourceSet.testListWebAppPathsEmpty();
            objTestJarResourceSet.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
