package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestDefaultServlet;

public class MainForTestDefaultServlet_testGetWithSubpathmount {
    public static void main(String[] args) {
        try {
            TestDefaultServlet.setUpPerTestClass();
            TestDefaultServlet objTestDefaultServlet = new TestDefaultServlet();
            objTestDefaultServlet.setUp();
            objTestDefaultServlet.testGetWithSubpathmount();
            objTestDefaultServlet.tearDown();
            TestDefaultServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
