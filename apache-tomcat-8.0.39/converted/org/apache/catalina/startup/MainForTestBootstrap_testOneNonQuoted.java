package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testOneNonQuoted {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testOneNonQuoted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
