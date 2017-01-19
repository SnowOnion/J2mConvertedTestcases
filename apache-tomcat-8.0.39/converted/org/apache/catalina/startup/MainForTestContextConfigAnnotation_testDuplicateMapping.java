package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testDuplicateMapping {
    public static void main(String[] args) {
        try {
            TestContextConfigAnnotation objTestContextConfigAnnotation = new TestContextConfigAnnotation();
            objTestContextConfigAnnotation.testDuplicateMapping();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
