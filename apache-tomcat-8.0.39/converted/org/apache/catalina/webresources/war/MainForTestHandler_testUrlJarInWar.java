package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testUrlJarInWar {
    public static void main(String[] args) {
        try {
            TestHandler objTestHandler = new TestHandler();
            objTestHandler.register();
            objTestHandler.testUrlJarInWar();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
