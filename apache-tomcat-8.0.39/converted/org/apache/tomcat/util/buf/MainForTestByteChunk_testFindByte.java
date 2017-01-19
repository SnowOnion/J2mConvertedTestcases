package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestByteChunk;

public class MainForTestByteChunk_testFindByte {
    public static void main(String[] args) {
        try {
            TestByteChunk objTestByteChunk = new TestByteChunk();
            objTestByteChunk.testFindByte();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
