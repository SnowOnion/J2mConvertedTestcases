package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSetMount;

public class MainForTestJarResourceSetMount_testWriteDirB {
    public static void main(String[] args) {
        try {
            TestJarResourceSetMount objTestJarResourceSetMount = new TestJarResourceSetMount();
            objTestJarResourceSetMount.setup();
            objTestJarResourceSetMount.testWriteDirB();
            objTestJarResourceSetMount.teardown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
