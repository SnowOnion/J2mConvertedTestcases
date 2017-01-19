package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testDefaultMixedCase {
    public static void main(String[] args) {
        try {
            TestAddCharSetFilter.setUpPerTestClass();
            TestAddCharSetFilter objTestAddCharSetFilter = new TestAddCharSetFilter();
            objTestAddCharSetFilter.setUp();
            objTestAddCharSetFilter.testDefaultMixedCase();
            objTestAddCharSetFilter.tearDown();
            TestAddCharSetFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
