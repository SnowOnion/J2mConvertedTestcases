package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckNotCORSRequestTypeEmptyOrigin {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckNotCORSRequestTypeEmptyOrigin();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
