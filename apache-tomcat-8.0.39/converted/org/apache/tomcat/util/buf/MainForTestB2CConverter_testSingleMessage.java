package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testSingleMessage {
    public static void main(String[] args) {
        try {
            TestB2CConverter objTestB2CConverter = new TestB2CConverter();
            objTestB2CConverter.testSingleMessage();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
