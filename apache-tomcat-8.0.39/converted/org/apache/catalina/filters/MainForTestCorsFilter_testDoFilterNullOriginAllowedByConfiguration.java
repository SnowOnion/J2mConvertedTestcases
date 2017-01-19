package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullOriginAllowedByConfiguration {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterNullOriginAllowedByConfiguration();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
