package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testTwoQuoted01 {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testTwoQuoted01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
