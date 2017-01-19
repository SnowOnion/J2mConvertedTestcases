package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testTwoMessage {
    public static void main(String[] args) {
        try {
            TestB2CConverter objTestB2CConverter = new TestB2CConverter();
            objTestB2CConverter.testTwoMessage();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
