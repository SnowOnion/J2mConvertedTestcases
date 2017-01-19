package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidCRLF3 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckInvalidCRLF3();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
