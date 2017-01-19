package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testOneQuoted01 {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testOneQuoted01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
