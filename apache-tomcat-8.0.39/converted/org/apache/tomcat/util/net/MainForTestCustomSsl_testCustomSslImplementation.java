package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestCustomSsl;

public class MainForTestCustomSsl_testCustomSslImplementation {
    public static void main(String[] args) {
        try {
            TestCustomSsl.setUpPerTestClass();
            TestCustomSsl objTestCustomSsl = new TestCustomSsl();
            objTestCustomSsl.setUp();
            objTestCustomSsl.testCustomSslImplementation();
            objTestCustomSsl.tearDown();
            TestCustomSsl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
