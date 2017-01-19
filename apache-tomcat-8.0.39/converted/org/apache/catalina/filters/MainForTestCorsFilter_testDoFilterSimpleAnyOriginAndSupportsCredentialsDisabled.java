package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleAnyOriginAndSupportsCredentialsDisabled {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSimpleAnyOriginAndSupportsCredentialsDisabled();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
