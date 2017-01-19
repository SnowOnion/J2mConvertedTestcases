package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestResourceJars;

public class MainForTestResourceJars_testNonStaticResources {
    public static void main(String[] args) {
        try {
            TestResourceJars objTestResourceJars = new TestResourceJars();
            objTestResourceJars.testNonStaticResources();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
