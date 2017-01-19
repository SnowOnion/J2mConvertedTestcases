package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandlerIntegration;

public class MainForTestHandlerIntegration_testToURI {
    public static void main(String[] args) {
        try {
            TestHandlerIntegration.setUpPerTestClass();
            TestHandlerIntegration objTestHandlerIntegration = new TestHandlerIntegration();
            objTestHandlerIntegration.setUp();
            objTestHandlerIntegration.testToURI();
            objTestHandlerIntegration.tearDown();
            TestHandlerIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
