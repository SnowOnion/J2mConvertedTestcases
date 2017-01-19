package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextAliases;

public class MainForTestStandardContextAliases_testDirContextAliases {
    public static void main(String[] args) {
        try {
            TestStandardContextAliases.setUpPerTestClass();
            TestStandardContextAliases objTestStandardContextAliases = new TestStandardContextAliases();
            objTestStandardContextAliases.setUp();
            objTestStandardContextAliases.testDirContextAliases();
            objTestStandardContextAliases.tearDown();
            TestStandardContextAliases.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
