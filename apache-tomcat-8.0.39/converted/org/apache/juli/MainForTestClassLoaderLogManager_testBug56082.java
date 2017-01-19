package org.apache.juli;

import org.apache.juli.TestClassLoaderLogManager;

public class MainForTestClassLoaderLogManager_testBug56082 {
    public static void main(String[] args) {
        try {
            TestClassLoaderLogManager objTestClassLoaderLogManager = new TestClassLoaderLogManager();
            objTestClassLoaderLogManager.testBug56082();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
