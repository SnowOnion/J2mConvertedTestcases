package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testOldFormat {
    public static void main(String[] args) {
        try {
            TestHandler objTestHandler = new TestHandler();
            objTestHandler.register();
            objTestHandler.testOldFormat();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
