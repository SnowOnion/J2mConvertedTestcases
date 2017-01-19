package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testInternal {
    public static void main(String[] args) {
        try {
            TestParameters objTestParameters = new TestParameters();
            objTestParameters.testInternal();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
