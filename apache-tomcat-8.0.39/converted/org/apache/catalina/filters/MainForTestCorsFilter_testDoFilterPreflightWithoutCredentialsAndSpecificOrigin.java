package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightWithoutCredentialsAndSpecificOrigin {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterPreflightWithoutCredentialsAndSpecificOrigin();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
