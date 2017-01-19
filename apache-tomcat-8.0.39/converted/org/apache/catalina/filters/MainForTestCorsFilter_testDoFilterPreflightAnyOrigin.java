package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightAnyOrigin {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterPreflightAnyOrigin();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
