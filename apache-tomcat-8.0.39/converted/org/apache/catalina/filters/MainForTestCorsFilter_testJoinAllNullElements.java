package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinAllNullElements {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testJoinAllNullElements();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
