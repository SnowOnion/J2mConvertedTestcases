package org.apache.juli;

import org.apache.juli.TestClassLoaderLogManager;

public class MainForTestClassLoaderLogManager_testReplace {
    public static void main(String[] args) {
        try {
            TestClassLoaderLogManager objTestClassLoaderLogManager = new TestClassLoaderLogManager();
            objTestClassLoaderLogManager.testReplace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
