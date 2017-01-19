package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestELInterpreterFactory;

public class MainForTestELInterpreterFactory_testBug54239 {
    public static void main(String[] args) {
        try {
            TestELInterpreterFactory.setUpPerTestClass();
            TestELInterpreterFactory objTestELInterpreterFactory = new TestELInterpreterFactory();
            objTestELInterpreterFactory.setUp();
            objTestELInterpreterFactory.testBug54239();
            objTestELInterpreterFactory.tearDown();
            TestELInterpreterFactory.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
