package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestB2CConverter;

public class MainForTestB2CConverter_testBug54602b {
    public static void main(String[] args) {
        try {
            TestB2CConverter objTestB2CConverter = new TestB2CConverter();
            objTestB2CConverter.testBug54602b();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
