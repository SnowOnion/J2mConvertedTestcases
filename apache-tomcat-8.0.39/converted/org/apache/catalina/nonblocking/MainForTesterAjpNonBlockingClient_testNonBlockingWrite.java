package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TesterAjpNonBlockingClient;

public class MainForTesterAjpNonBlockingClient_testNonBlockingWrite {
    public static void main(String[] args) {
        try {
            TesterAjpNonBlockingClient.setUpPerTestClass();
            TesterAjpNonBlockingClient objTesterAjpNonBlockingClient = new TesterAjpNonBlockingClient();
            objTesterAjpNonBlockingClient.setUp();
            objTesterAjpNonBlockingClient.testNonBlockingWrite();
            objTesterAjpNonBlockingClient.tearDown();
            TesterAjpNonBlockingClient.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
