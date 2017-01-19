package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSameHostWithOrigin03 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSameHostWithOrigin03();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
