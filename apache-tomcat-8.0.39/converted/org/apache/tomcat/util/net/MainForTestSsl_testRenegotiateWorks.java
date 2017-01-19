package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestSsl;

public class MainForTestSsl_testRenegotiateWorks {
    public static void main(String[] args) {
        try {
            TestSsl.setUpPerTestClass();
            TestSsl objTestSsl = new TestSsl();
            objTestSsl.setUp();
            objTestSsl.testRenegotiateWorks();
            objTestSsl.tearDown();
            TestSsl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
