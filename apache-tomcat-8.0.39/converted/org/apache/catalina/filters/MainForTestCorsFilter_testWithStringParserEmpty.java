package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithStringParserEmpty {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testWithStringParserEmpty();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
