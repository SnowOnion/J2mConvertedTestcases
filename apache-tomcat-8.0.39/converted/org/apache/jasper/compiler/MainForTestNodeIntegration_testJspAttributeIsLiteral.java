package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestNodeIntegration;

public class MainForTestNodeIntegration_testJspAttributeIsLiteral {
    public static void main(String[] args) {
        try {
            TestNodeIntegration.setUpPerTestClass();
            TestNodeIntegration objTestNodeIntegration = new TestNodeIntegration();
            objTestNodeIntegration.setUp();
            objTestNodeIntegration.testJspAttributeIsLiteral();
            objTestNodeIntegration.tearDown();
            TestNodeIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
