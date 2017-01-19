package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testBug57601 {
    public static void main(String[] args) {
        try {
            TestDefaultServlet.setUpPerTestClass();
            TestDefaultServlet objTestDefaultServlet = new TestDefaultServlet();
            objTestDefaultServlet.setUp();
            objTestDefaultServlet.testBug57601();
            objTestDefaultServlet.tearDown();
            TestDefaultServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
