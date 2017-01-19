package org.apache.tomcat.util.res;

import org.apache.tomcat.util.res.TestStringManager;

public class MainForTestStringManager_testNullKey {
    public static void main(String[] args) {
        try {
            TestStringManager objTestStringManager = new TestStringManager();
            objTestStringManager.testNullKey();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
