package org.apache.catalina.startup;

import org.apache.catalina.startup.TestBootstrap;

public class MainForTestBootstrap_testUnbalancedQuotes03 {
    public static void main(String[] args) {
        try {
            TestBootstrap objTestBootstrap = new TestBootstrap();
            objTestBootstrap.testUnbalancedQuotes03();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
