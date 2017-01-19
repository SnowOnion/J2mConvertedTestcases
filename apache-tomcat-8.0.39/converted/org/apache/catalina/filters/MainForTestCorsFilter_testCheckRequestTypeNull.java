package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckRequestTypeNull {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckRequestTypeNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
