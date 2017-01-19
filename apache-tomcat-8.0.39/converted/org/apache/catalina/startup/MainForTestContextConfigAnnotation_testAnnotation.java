package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testAnnotation {
    public static void main(String[] args) {
        try {
            TestContextConfigAnnotation objTestContextConfigAnnotation = new TestContextConfigAnnotation();
            objTestContextConfigAnnotation.testAnnotation();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
