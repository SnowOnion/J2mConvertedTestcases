package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSet;

public class MainForTestJarResourceSet_testListWebAppPathsRootNoSlash {
    public static void main(String[] args) {
        try {
            TestJarResourceSet objTestJarResourceSet = new TestJarResourceSet();
            objTestJarResourceSet.setup();
            objTestJarResourceSet.testListWebAppPathsRootNoSlash();
            objTestJarResourceSet.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
