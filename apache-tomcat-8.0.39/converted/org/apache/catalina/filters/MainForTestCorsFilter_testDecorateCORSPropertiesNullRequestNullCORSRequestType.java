package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesNullRequestNullCORSRequestType {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDecorateCORSPropertiesNullRequestNullCORSRequestType();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
