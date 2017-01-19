package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInValidOriginCRLF {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testInValidOriginCRLF();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
