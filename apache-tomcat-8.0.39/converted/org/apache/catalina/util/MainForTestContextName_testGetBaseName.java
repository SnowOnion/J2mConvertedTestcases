package org.apache.catalina.util;

import org.apache.catalina.util.TestContextName;

public class MainForTestContextName_testGetBaseName {
    public static void main(String[] args) {
        try {
            TestContextName objTestContextName = new TestContextName();
            objTestContextName.setUp();
            objTestContextName.testGetBaseName();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
