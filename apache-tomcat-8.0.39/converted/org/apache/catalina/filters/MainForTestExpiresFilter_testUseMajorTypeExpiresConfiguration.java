package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testUseMajorTypeExpiresConfiguration {
    public static void main(String[] args) {
        try {
            TestExpiresFilter.setUpPerTestClass();
            TestExpiresFilter objTestExpiresFilter = new TestExpiresFilter();
            objTestExpiresFilter.setUp();
            objTestExpiresFilter.testUseMajorTypeExpiresConfiguration();
            objTestExpiresFilter.tearDown();
            TestExpiresFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
