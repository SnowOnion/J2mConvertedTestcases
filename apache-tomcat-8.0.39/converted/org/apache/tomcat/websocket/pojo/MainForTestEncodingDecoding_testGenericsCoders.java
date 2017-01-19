package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestEncodingDecoding;

public class MainForTestEncodingDecoding_testGenericsCoders {
    public static void main(String[] args) {
        try {
            TestEncodingDecoding.setUpPerTestClass();
            TestEncodingDecoding objTestEncodingDecoding = new TestEncodingDecoding();
            objTestEncodingDecoding.setUp();
            objTestEncodingDecoding.testGenericsCoders();
            objTestEncodingDecoding.tearDown();
            TestEncodingDecoding.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
