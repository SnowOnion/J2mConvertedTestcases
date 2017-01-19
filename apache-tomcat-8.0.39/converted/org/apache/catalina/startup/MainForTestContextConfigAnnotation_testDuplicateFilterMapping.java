package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testDuplicateFilterMapping {
    public static void main(String[] args) {
        try {
            TestContextConfigAnnotation objTestContextConfigAnnotation = new TestContextConfigAnnotation();
            objTestContextConfigAnnotation.testDuplicateFilterMapping();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
