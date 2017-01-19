package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightNegativeMaxAge {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterPreflightNegativeMaxAge();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
