package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testThreeNonQuoted {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testThreeNonQuoted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
