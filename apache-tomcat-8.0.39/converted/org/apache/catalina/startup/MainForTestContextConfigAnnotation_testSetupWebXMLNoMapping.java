package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testSetupWebXMLNoMapping {
    public static void main(String[] args) {
        try {
            TestContextConfigAnnotation objTestContextConfigAnnotation = new TestContextConfigAnnotation();
            objTestContextConfigAnnotation.testSetupWebXMLNoMapping();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
