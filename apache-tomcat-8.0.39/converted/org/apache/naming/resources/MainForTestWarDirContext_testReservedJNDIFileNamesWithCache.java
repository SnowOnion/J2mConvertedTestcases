package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testReservedJNDIFileNamesWithCache {
    public static void main(String[] args) {
        try {
            TestWarDirContext.setUpPerTestClass();
            TestWarDirContext objTestWarDirContext = new TestWarDirContext();
            objTestWarDirContext.testReservedJNDIFileNamesWithCache();
            objTestWarDirContext.tearDown();
            TestWarDirContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
