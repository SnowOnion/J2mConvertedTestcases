package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestWebdavServlet;

public class MainForTestWebdavServlet_testGetWithSubpathmount {
    public static void main(String[] args) {
        try {
            TestWebdavServlet.setUpPerTestClass();
            TestWebdavServlet objTestWebdavServlet = new TestWebdavServlet();
            objTestWebdavServlet.setUp();
            objTestWebdavServlet.testGetWithSubpathmount();
            objTestWebdavServlet.tearDown();
            TestWebdavServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
