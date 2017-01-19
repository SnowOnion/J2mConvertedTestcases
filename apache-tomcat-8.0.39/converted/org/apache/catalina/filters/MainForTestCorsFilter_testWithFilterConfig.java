package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithFilterConfig {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testWithFilterConfig();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
