package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestJspContextWrapper;

public class MainForTestJspContextWrapper_testELTagFilePageContext {
    public static void main(String[] args) {
        try {
            TestJspContextWrapper.setUpPerTestClass();
            TestJspContextWrapper objTestJspContextWrapper = new TestJspContextWrapper();
            objTestJspContextWrapper.setUp();
            objTestJspContextWrapper.testELTagFilePageContext();
            objTestJspContextWrapper.tearDown();
            TestJspContextWrapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
