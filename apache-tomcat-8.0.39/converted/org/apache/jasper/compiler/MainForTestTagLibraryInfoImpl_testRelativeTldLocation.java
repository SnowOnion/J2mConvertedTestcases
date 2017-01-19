package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestTagLibraryInfoImpl;

public class MainForTestTagLibraryInfoImpl_testRelativeTldLocation {
    public static void main(String[] args) {
        try {
            TestTagLibraryInfoImpl.setUpPerTestClass();
            TestTagLibraryInfoImpl objTestTagLibraryInfoImpl = new TestTagLibraryInfoImpl();
            objTestTagLibraryInfoImpl.setUp();
            objTestTagLibraryInfoImpl.testRelativeTldLocation();
            objTestTagLibraryInfoImpl.tearDown();
            TestTagLibraryInfoImpl.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
