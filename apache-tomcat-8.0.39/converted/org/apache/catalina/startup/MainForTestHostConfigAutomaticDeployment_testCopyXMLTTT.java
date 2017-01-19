package org.apache.catalina.startup;

import org.apache.catalina.startup.TestHostConfigAutomaticDeployment;

public class MainForTestHostConfigAutomaticDeployment_testCopyXMLTTT {
    public static void main(String[] args) {
        try {
            TestHostConfigAutomaticDeployment.setUpPerTestClass();
            TestHostConfigAutomaticDeployment objTestHostConfigAutomaticDeployment = new TestHostConfigAutomaticDeployment();
            objTestHostConfigAutomaticDeployment.testCopyXMLTTT();
            objTestHostConfigAutomaticDeployment.tearDown();
            TestHostConfigAutomaticDeployment.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
