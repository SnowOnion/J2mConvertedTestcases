package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testEmptyQuoted {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testEmptyQuoted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
