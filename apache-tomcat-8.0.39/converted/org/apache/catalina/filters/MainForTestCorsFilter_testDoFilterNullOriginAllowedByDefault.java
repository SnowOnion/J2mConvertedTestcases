package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullOriginAllowedByDefault {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterNullOriginAllowedByDefault();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
