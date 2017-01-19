package org.apache.tomcat.util.res;

import org.apache.tomcat.util.res.TestStringManager;

public class MainForTestStringManager_testBug46933 {
    public static void main(String[] args) {
        try {
            TestStringManager objTestStringManager = new TestStringManager();
            objTestStringManager.testBug46933();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
