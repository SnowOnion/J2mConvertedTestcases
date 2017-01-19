package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertPostSame {
    public static void main(String[] args) {
        try {
            TestClientCert.setUpPerTestClass();
            TestClientCert objTestClientCert = new TestClientCert();
            objTestClientCert.testClientCertPostSame();
            objTestClientCert.tearDown();
            TestClientCert.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
