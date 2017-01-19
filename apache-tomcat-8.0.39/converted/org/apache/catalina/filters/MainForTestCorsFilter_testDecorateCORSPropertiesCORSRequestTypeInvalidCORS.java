package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesCORSRequestTypeInvalidCORS {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDecorateCORSPropertiesCORSRequestTypeInvalidCORS();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
