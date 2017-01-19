package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testInitializerFromClasspath {
    public static void main(String[] args) {
        try {
            TestWebappServiceLoader objTestWebappServiceLoader = new TestWebappServiceLoader();
            objTestWebappServiceLoader.init();
            objTestWebappServiceLoader.testInitializerFromClasspath();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
