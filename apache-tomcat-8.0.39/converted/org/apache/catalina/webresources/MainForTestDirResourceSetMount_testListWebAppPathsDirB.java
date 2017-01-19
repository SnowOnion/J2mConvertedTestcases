package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSetMount;

public class MainForTestDirResourceSetMount_testListWebAppPathsDirB {
    public static void main(String[] args) {
        try {
            TestDirResourceSetMount.before();
            TestDirResourceSetMount objTestDirResourceSetMount = new TestDirResourceSetMount();
            objTestDirResourceSetMount.setup();
            objTestDirResourceSetMount.testListWebAppPathsDirB();
            objTestDirResourceSetMount.teardown();
            TestDirResourceSetMount.after();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
