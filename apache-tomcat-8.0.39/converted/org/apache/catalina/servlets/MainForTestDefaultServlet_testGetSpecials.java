package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testGetSpecials {
    public static void main(String[] args) {
        try {
            TestDefaultServlet.setUpPerTestClass();
            TestDefaultServlet objTestDefaultServlet = new TestDefaultServlet();
            objTestDefaultServlet.setUp();
            objTestDefaultServlet.testGetSpecials();
            objTestDefaultServlet.tearDown();
            TestDefaultServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
