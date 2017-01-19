package org.apache.catalina.util;

import org.apache.catalina.util.TestServerInfo;

public class MainForTestServerInfo_testServerInfo {
    public static void main(String[] args) {
        try {
            TestServerInfo objTestServerInfo = new TestServerInfo();
            objTestServerInfo.testServerInfo();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
