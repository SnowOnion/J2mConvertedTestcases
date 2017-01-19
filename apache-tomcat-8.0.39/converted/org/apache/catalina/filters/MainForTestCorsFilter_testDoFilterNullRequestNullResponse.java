package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullRequestNullResponse {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testDoFilterNullRequestNullResponse();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
