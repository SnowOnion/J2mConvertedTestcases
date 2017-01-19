package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TesterAjpNonBlockingClient;

public class MainForTesterAjpNonBlockingClient_doTestAJPNonBlockingRead {
    public static void main(String[] args) {
        try {
            TesterAjpNonBlockingClient.setUpPerTestClass();
            TesterAjpNonBlockingClient objTesterAjpNonBlockingClient = new TesterAjpNonBlockingClient();
            objTesterAjpNonBlockingClient.setUp();
            objTesterAjpNonBlockingClient.doTestAJPNonBlockingRead();
            objTesterAjpNonBlockingClient.tearDown();
            TesterAjpNonBlockingClient.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
