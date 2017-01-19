package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestHexUtils;

public class MainForTestHexUtils_testRoundTrip01 {
    public static void main(String[] args) {
        try {
            TestHexUtils objTestHexUtils = new TestHexUtils();
            objTestHexUtils.testRoundTrip01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
