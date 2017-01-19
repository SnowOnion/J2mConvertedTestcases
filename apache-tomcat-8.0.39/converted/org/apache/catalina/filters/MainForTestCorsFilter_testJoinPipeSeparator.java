package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinPipeSeparator {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testJoinPipeSeparator();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
