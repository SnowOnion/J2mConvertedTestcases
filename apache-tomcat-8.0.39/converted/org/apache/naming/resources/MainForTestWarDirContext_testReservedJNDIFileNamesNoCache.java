package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testReservedJNDIFileNamesNoCache {
    public static void main(String[] args) {
        try {
            TestWarDirContext.setUpPerTestClass();
            TestWarDirContext objTestWarDirContext = new TestWarDirContext();
            objTestWarDirContext.testReservedJNDIFileNamesNoCache();
            objTestWarDirContext.tearDown();
            TestWarDirContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
