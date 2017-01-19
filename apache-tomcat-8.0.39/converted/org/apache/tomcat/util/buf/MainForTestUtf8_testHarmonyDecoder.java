package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUtf8;

public class MainForTestUtf8_testHarmonyDecoder {
    public static void main(String[] args) {
        try {
            TestUtf8 objTestUtf8 = new TestUtf8();
            objTestUtf8.testHarmonyDecoder();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
