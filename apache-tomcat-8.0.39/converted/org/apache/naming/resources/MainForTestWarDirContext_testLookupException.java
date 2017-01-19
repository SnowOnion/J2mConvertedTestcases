package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testLookupException {
    public static void main(String[] args) {
        try {
            TestWarDirContext.setUpPerTestClass();
            TestWarDirContext objTestWarDirContext = new TestWarDirContext();
            objTestWarDirContext.testLookupException();
            objTestWarDirContext.tearDown();
            TestWarDirContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
