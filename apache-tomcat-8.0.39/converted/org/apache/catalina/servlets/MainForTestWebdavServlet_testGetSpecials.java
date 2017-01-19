package org.apache.catalina.servlets;

import org.apache.catalina.servlets.TestWebdavServlet;

public class MainForTestWebdavServlet_testGetSpecials {
    public static void main(String[] args) {
        try {
            TestWebdavServlet.setUpPerTestClass();
            TestWebdavServlet objTestWebdavServlet = new TestWebdavServlet();
            objTestWebdavServlet.setUp();
            objTestWebdavServlet.testGetSpecials();
            objTestWebdavServlet.tearDown();
            TestWebdavServlet.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
