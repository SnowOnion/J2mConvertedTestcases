package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleAnyOriginAndSupportsCredentials {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSimpleAnyOriginAndSupportsCredentials();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
