package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testEmptyNonQuoted {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testEmptyNonQuoted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
