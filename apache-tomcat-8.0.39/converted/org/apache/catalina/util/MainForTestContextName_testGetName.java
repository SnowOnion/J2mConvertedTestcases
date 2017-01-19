package org.apache.catalina.util;

import org.apache.catalina.util.TestContextName;

public class MainForTestContextName_testGetName {
    public static void main(String[] args) {
        try {
            TestContextName objTestContextName = new TestContextName();
            objTestContextName.setUp();
            objTestContextName.testGetName();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
