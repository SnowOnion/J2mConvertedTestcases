package org.apache.jasper.servlet;

import org.apache.jasper.servlet.TestJspCServletContext;

public class MainForTestJspCServletContext_testWebresources {
    public static void main(String[] args) {
        try {
            TestJspCServletContext objTestJspCServletContext = new TestJspCServletContext();
            objTestJspCServletContext.testWebresources();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
