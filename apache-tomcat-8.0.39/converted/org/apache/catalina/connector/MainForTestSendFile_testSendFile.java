package org.apache.catalina.connector;

import org.apache.catalina.connector.TestSendFile;

public class MainForTestSendFile_testSendFile {
    public static void main(String[] args) {
        try {
            TestSendFile.setUpPerTestClass();
            TestSendFile objTestSendFile = new TestSendFile();
            objTestSendFile.setUp();
            objTestSendFile.testSendFile();
            objTestSendFile.tearDown();
            TestSendFile.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
