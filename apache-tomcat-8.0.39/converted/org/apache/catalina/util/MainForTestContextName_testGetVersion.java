package org.apache.catalina.util;

import org.apache.catalina.util.TestContextName;

public class MainForTestContextName_testGetVersion {
    public static void main(String[] args) {
        try {
            TestContextName objTestContextName = new TestContextName();
            objTestContextName.setUp();
            objTestContextName.testGetVersion();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
