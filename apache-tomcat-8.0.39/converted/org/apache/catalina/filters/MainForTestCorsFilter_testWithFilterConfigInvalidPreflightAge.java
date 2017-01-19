package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithFilterConfigInvalidPreflightAge {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testWithFilterConfigInvalidPreflightAge();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
