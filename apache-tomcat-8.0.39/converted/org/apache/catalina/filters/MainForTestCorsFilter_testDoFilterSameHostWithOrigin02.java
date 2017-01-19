package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSameHostWithOrigin02 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSameHostWithOrigin02();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
