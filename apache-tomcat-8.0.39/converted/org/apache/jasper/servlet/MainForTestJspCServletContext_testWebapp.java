package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspCServletContext;

public class MainForTestJspCServletContext_testWebapp {
    public static void main(String[] args) {
        try {
            TestJspCServletContext objTestJspCServletContext = new TestJspCServletContext();
            objTestJspCServletContext.testWebapp();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
