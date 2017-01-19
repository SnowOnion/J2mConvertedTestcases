package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcatClassLoader;

public class MainForTestTomcatClassLoader_testDefaultClassLoader {
    public static void main(String[] args) {
        try {
            TestTomcatClassLoader.setUpPerTestClass();
            TestTomcatClassLoader objTestTomcatClassLoader = new TestTomcatClassLoader();
            objTestTomcatClassLoader.setUp();
            objTestTomcatClassLoader.testDefaultClassLoader();
            objTestTomcatClassLoader.tearDown();
            TestTomcatClassLoader.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
