package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithStringParserNull {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testWithStringParserNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
