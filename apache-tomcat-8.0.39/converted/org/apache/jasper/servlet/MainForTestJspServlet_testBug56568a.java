package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspServlet;

public class MainForTestJspServlet_testBug56568a {
    public static void main(String[] args) {
        try {
            TestJspServlet.setUpPerTestClass();
            TestJspServlet objTestJspServlet = new TestJspServlet();
            objTestJspServlet.setUp();
            objTestJspServlet.testBug56568a();
            objTestJspServlet.tearDown();
            TestJspServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
