package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesCORSRequestTypeNotCORS {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDecorateCORSPropertiesCORSRequestTypeNotCORS();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
