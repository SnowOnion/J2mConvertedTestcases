package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleSpecificHeader {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterSimpleSpecificHeader();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
