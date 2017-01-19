package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSetMount;

public class MainForTestJarResourceSetMount_testListDirA {
    public static void main(String[] args) {
        try {
            TestJarResourceSetMount objTestJarResourceSetMount = new TestJarResourceSetMount();
            objTestJarResourceSetMount.setup();
            objTestJarResourceSetMount.testListDirA();
            objTestJarResourceSetMount.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
