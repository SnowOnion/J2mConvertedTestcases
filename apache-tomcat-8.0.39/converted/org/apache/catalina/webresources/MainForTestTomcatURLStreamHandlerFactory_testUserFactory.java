package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestTomcatURLStreamHandlerFactory;

public class MainForTestTomcatURLStreamHandlerFactory_testUserFactory {
    public static void main(String[] args) {
        try {
            TestTomcatURLStreamHandlerFactory objTestTomcatURLStreamHandlerFactory = new TestTomcatURLStreamHandlerFactory();
            objTestTomcatURLStreamHandlerFactory.register();
            objTestTomcatURLStreamHandlerFactory.testUserFactory();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
