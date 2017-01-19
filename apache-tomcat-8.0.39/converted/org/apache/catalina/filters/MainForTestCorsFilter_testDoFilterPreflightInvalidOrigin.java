package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightInvalidOrigin {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterPreflightInvalidOrigin();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
