package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInValidOriginEncodedCRLF1 {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testInValidOriginEncodedCRLF1();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
