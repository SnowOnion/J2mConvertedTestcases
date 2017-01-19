package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testOverwriteAnnotation {
    public static void main(String[] args) {
        try {
            TestContextConfigAnnotation objTestContextConfigAnnotation = new TestContextConfigAnnotation();
            objTestContextConfigAnnotation.testOverwriteAnnotation();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
