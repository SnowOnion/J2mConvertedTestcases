package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestTagPluginManager;

public class MainForTestTagPluginManager_testBug54240 {
    public static void main(String[] args) {
        try {
            TestTagPluginManager.setUpPerTestClass();
            TestTagPluginManager objTestTagPluginManager = new TestTagPluginManager();
            objTestTagPluginManager.setUp();
            objTestTagPluginManager.testBug54240();
            objTestTagPluginManager.tearDown();
            TestTagPluginManager.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
