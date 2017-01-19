package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinElementsNull {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testJoinElementsNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
