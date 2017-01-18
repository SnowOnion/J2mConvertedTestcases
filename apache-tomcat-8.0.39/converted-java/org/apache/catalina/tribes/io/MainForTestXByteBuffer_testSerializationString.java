package org.apache.catalina.tribes.io;

import org.apache.catalina.tribes.io.TestXByteBuffer;

public class MainForTestXByteBuffer_testSerializationString {
	public static void main(String[] args) {
		try {
			new TestXByteBuffer().testSerializationString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}