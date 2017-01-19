package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInitDefaultFilterConfig {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testInitDefaultFilterConfig();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
