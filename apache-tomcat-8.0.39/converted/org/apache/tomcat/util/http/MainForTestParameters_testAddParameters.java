package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestParameters;

public class MainForTestParameters_testAddParameters {
    public static void main(String[] args) {
        try {
            TestParameters objTestParameters = new TestParameters();
            objTestParameters.testAddParameters();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
