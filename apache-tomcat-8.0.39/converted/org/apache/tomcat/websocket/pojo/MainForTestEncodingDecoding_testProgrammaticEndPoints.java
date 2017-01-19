package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testProgrammaticEndPoints {
    public static void main(String[] args) {
        try {
            TestEncodingDecoding.setUpPerTestClass();
            TestEncodingDecoding objTestEncodingDecoding = new TestEncodingDecoding();
            objTestEncodingDecoding.setUp();
            objTestEncodingDecoding.testProgrammaticEndPoints();
            objTestEncodingDecoding.tearDown();
            TestEncodingDecoding.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
