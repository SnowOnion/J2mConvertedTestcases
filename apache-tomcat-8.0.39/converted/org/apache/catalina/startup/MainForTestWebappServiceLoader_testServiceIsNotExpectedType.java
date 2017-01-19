package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testServiceIsNotExpectedType {
    public static void main(String[] args) {
        try {
            TestWebappServiceLoader objTestWebappServiceLoader = new TestWebappServiceLoader();
            objTestWebappServiceLoader.init();
            objTestWebappServiceLoader.testServiceIsNotExpectedType();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
