package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testParseConfigFile {
    public static void main(String[] args) {
        try {
            TestWebappServiceLoader objTestWebappServiceLoader = new TestWebappServiceLoader();
            objTestWebappServiceLoader.init();
            objTestWebappServiceLoader.testParseConfigFile();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
