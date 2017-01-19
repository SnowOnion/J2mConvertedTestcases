package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInValidOriginEncodedCRLF2 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testInValidOriginEncodedCRLF2();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
