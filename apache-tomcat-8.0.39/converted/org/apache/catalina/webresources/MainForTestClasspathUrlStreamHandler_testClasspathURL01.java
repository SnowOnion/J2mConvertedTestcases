package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestClasspathUrlStreamHandler;

public class MainForTestClasspathUrlStreamHandler_testClasspathURL01 {
    public static void main(String[] args) {
        try {
            TestClasspathUrlStreamHandler.setup();
            TestClasspathUrlStreamHandler objTestClasspathUrlStreamHandler = new TestClasspathUrlStreamHandler();
            objTestClasspathUrlStreamHandler.testClasspathURL01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
