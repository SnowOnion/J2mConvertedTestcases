package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testAddParametersLimit {
    public static void main(String[] args) {
        try {
            TestParameters objTestParameters = new TestParameters();
            objTestParameters.testAddParametersLimit();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
