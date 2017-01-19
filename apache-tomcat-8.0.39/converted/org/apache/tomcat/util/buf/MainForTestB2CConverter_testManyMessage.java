package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testManyMessage {
    public static void main(String[] args) {
        try {
            TestB2CConverter objTestB2CConverter = new TestB2CConverter();
            objTestB2CConverter.testManyMessage();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
