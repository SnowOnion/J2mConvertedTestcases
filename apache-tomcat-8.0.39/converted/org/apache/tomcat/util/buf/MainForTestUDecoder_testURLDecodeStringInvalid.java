package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestUDecoder;

public class MainForTestUDecoder_testURLDecodeStringInvalid {
    public static void main(String[] args) {
        try {
            TestUDecoder objTestUDecoder = new TestUDecoder();
            objTestUDecoder.testURLDecodeStringInvalid();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
