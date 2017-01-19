package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextResources;

public class MainForTestStandardContextResources_testResourcesWebInfClasses {
    public static void main(String[] args) {
        try {
            TestStandardContextResources.setUpPerTestClass();
            TestStandardContextResources objTestStandardContextResources = new TestStandardContextResources();
            objTestStandardContextResources.testResourcesWebInfClasses();
            objTestStandardContextResources.tearDown();
            TestStandardContextResources.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
