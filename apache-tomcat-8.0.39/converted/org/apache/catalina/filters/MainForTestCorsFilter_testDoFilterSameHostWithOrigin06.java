package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSameHostWithOrigin06 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSameHostWithOrigin06();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
