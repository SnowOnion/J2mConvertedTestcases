package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testLoadServices {
    public static void main(String[] args) {
        try {
            TestWebappServiceLoader objTestWebappServiceLoader = new TestWebappServiceLoader();
            objTestWebappServiceLoader.init();
            objTestWebappServiceLoader.testLoadServices();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
