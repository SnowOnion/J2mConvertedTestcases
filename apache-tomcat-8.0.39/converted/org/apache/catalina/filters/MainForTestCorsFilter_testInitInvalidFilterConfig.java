package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInitInvalidFilterConfig {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testInitInvalidFilterConfig();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
