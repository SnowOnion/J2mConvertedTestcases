package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinAllEmptyElements {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testJoinAllEmptyElements();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
