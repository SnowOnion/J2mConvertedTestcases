package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestClientCert;

public class MainForTestClientCert_testClientCertGetWithoutPreemptive {
    public static void main(String[] args) {
        try {
            TestClientCert.setUpPerTestClass();
            TestClientCert objTestClientCert = new TestClientCert();
            objTestClientCert.testClientCertGetWithoutPreemptive();
            objTestClientCert.tearDown();
            TestClientCert.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
