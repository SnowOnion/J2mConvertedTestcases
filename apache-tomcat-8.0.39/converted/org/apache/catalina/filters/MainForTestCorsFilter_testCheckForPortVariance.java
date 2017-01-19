package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckForPortVariance {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckForPortVariance();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
