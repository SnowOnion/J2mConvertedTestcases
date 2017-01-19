package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestJspContextWrapper;

public class MainForTestJspContextWrapper_testELTagFileImports {
    public static void main(String[] args) {
        try {
            TestJspContextWrapper.setUpPerTestClass();
            TestJspContextWrapper objTestJspContextWrapper = new TestJspContextWrapper();
            objTestJspContextWrapper.setUp();
            objTestJspContextWrapper.testELTagFileImports();
            objTestJspContextWrapper.tearDown();
            TestJspContextWrapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
