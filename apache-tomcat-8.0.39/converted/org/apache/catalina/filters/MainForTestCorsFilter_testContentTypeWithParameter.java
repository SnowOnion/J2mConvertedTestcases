package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testContentTypeWithParameter {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testContentTypeWithParameter();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
