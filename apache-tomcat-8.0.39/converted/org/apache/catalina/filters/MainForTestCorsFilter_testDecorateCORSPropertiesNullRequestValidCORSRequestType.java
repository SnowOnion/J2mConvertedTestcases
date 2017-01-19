package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesNullRequestValidCORSRequestType {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDecorateCORSPropertiesNullRequestValidCORSRequestType();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
