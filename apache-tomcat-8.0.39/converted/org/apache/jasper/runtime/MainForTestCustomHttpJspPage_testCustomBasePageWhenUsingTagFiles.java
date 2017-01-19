package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestCustomHttpJspPage;

public class MainForTestCustomHttpJspPage_testCustomBasePageWhenUsingTagFiles {
    public static void main(String[] args) {
        try {
            TestCustomHttpJspPage.setUpPerTestClass();
            TestCustomHttpJspPage objTestCustomHttpJspPage = new TestCustomHttpJspPage();
            objTestCustomHttpJspPage.setUp();
            objTestCustomHttpJspPage.testCustomBasePageWhenUsingTagFiles();
            objTestCustomHttpJspPage.tearDown();
            TestCustomHttpJspPage.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
