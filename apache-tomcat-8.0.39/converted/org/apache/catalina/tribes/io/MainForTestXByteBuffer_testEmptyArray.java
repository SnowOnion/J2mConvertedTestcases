package org.apache.catalina.tribes.io;

import org.apache.catalina.tribes.io.TestXByteBuffer;

public class MainForTestXByteBuffer_testEmptyArray {
    public static void main(String[] args) {
        try {
            TestXByteBuffer objTestXByteBuffer = new TestXByteBuffer();
            objTestXByteBuffer.testEmptyArray();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
